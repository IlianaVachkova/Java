import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Pattern pattern = Pattern.compile("\\b[A-Z][A-Za-z]*[A-Z]\\b");
        for (String word : input) {
            Matcher match = pattern.matcher(word);
            if (match.find()) {
                System.out.print(match.group() + " ");
            }
        }
        System.out.println();
    }
}
