import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _09_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine().toLowerCase();
        String[] wordsArr = text.split("[^\\w]+");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsArr) {
            if (wordCount.get(word) == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        int mostFrequent = 0;
        Set<Map.Entry<String, Integer>> entries = wordCount.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > mostFrequent) {
                mostFrequent = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == mostFrequent) {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
            }
        }
    }
}
