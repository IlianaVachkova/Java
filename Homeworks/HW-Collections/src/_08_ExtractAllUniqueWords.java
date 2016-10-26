import java.util.Scanner;
import java.util.TreeSet;

public class _08_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine().toLowerCase();
        String[] wordsArr = text.split("[^\\w]+");
        TreeSet<String> uniqueWords = new TreeSet<String>();

        for (int i = 0; i < wordsArr.length; i++) {
            uniqueWords.add(wordsArr[i]);
        }

        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }
}
