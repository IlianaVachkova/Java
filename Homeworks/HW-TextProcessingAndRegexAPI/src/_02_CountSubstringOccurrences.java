import java.util.Scanner;

public class _02_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine().toLowerCase();
        System.out.println("Enter a substring matcher: ");
        String substrMatcher = scanner.nextLine().toLowerCase();

        String[] wordsAsArr = text.split("[^\\w]+");
        int len = substrMatcher.length();

        int count = 0;
        String currentWord = "";
        String tempSubstr = "";
        for (int i = 0; i < wordsAsArr.length; i++) {
            currentWord = wordsAsArr[i];

            for (int j = 0; j < (currentWord.length() - len + 1); j++) {
                tempSubstr = currentWord.substring(j, j + len);

                if (tempSubstr.equals(substrMatcher)) {
                    count += 1;
                }
            }
        }

        System.out.print(count);
    }
}
