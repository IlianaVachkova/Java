import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Events {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, TreeMap<String, List<String>>> events = new HashMap<String, TreeMap<String, List<String>>>();

        int num = sc.nextInt();
        sc.nextLine();

        String line = "";
        String person, location, time;
        for (int i = 0; i < num; i++) {
            line = sc.nextLine();

            Pattern pattern = Pattern.compile("^#([a-zA-Z]+):\\s*@([a-zA-Z]+)\\s*(([0-1]?[0-9]|[2][0-3]):([0-5][0-9]))$");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                person = matcher.group(1);
                location = matcher.group(2);
                time = matcher.group(3);

                if (!events.containsKey(location)) {
                    events.put(location, new TreeMap<>());
                }

                if (!events.get(location).containsKey(person)) {
                    events.get(location).put(person, new ArrayList<>());
                }

                events.get(location).get(person).add(time);
            }
        }

        String locations = sc.nextLine();
        String[] locationsArr = locations.split(",");
        Arrays.sort(locationsArr);
        String currentLoction = "";
        String[] names;
        List<String> times;
        for (int i = 0; i < locationsArr.length; i++) {
            currentLoction = locationsArr[i];

            if (events.containsKey(currentLoction)) {
                System.out.println(currentLoction + ":");

                names = new String[events.get(currentLoction).size()];
                events.get(currentLoction).keySet().toArray(names);

                int counter = 1;
                String currentName;
                for (int j = 0; j < names.length; j++) {
                    currentName = names[j];
                    System.out.printf("%d. %s -> ", counter, currentName);
                    times = events.get(currentLoction).get(currentName);
                    times.sort(String::compareTo);
                    String str = times.toString().replace("[", "").replace("]", "").trim();
                    System.out.println(str);
                    counter++;
                }
            }
        }
    }
}
