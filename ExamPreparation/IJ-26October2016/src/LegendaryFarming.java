import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        TreeMap<String, Integer> validMaterials = new TreeMap<String, Integer>();
        validMaterials.put("shards", 0);
        validMaterials.put("motes", 0);
        validMaterials.put("fragments", 0);
        TreeMap<String, Integer> invalidMaterials = new TreeMap<String, Integer>();


        String material = "";
        int quantity = 0;
        int tempQuantity = 0;
        boolean toBreak = false;
        while (sc.hasNextLine()) {
            line = sc.nextLine().toLowerCase();
            if (line.equals("") || toBreak) {
                break;
            }
            String regex = "\\s*(\\d+)\\s*([a-zA-Z]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                quantity = Integer.parseInt(matcher.group(1));
                material = matcher.group(2);

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    tempQuantity = validMaterials.get(material).intValue() + quantity;
                    validMaterials.put(material, tempQuantity);
                } else {
                    if (!invalidMaterials.containsKey(material)) {
                        invalidMaterials.put(material, quantity);
                    } else {
                        tempQuantity = invalidMaterials.get(material).intValue() + quantity;
                        invalidMaterials.put(material, tempQuantity);
                    }
                }

                if (validMaterials.containsKey("shards") && validMaterials.get("shards").intValue() >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    tempQuantity = validMaterials.get("shards").intValue() - 250;
                    validMaterials.put("shards", tempQuantity);
                    toBreak = true;
                    break;
                }
                if (validMaterials.containsKey("fragments") && validMaterials.get("fragments").intValue() >= 250) {
                    System.out.println("Valanyr obtained!");
                    tempQuantity = validMaterials.get("fragments").intValue() - 250;
                    validMaterials.put("fragments", tempQuantity);
                    toBreak = true;
                    break;
                }
                if (validMaterials.containsKey("motes") && validMaterials.get("motes").intValue() >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    tempQuantity = validMaterials.get("motes").intValue() - 250;
                    validMaterials.put("motes", tempQuantity);
                    toBreak = true;
                    break;
                }
            }
        }

        validMaterials.entrySet().stream()
                .sorted((k1, k2) -> k2.getValue().compareTo(k1.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));

        for (Map.Entry<String, Integer> entry : invalidMaterials.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }

    private static TreeMap sortByValues(TreeMap map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        TreeMap sortedHashMap = new TreeMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
