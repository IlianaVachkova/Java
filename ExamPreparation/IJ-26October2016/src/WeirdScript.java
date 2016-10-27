import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeirdScript {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int keyNumber = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        keyNumber = keyNumber - 1;
        int letterPos = keyNumber % 26;
        String key = "";

        if ((keyNumber / 26) % 2 == 0) {
            key += (char) (letterPos + 97);
            key += (char) (letterPos + 97);
        } else {
            key += (char) (letterPos + 65);
            key += (char) (letterPos + 65);
        }

        StringBuilder sb = new StringBuilder();
        while (!line.equals("End")) {
            sb.append(line);
            line = sc.nextLine();
        }

        String text = sb.toString();
        String regex = key + "(.*?)" + key;
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(text);

        while (match.find()) {
            if (match.group(1).length() > 0) {
                System.out.println(match.group(1));
            }
        }
    }
}
