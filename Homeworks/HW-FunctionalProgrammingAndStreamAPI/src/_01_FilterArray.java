import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_FilterArray {
    private static boolean isGreaterThanThreeChars(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += 1;
        }

        if (count <= 3) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        String[] wordsAsArr = text.split(" ");

        List<String> words = Arrays.stream(wordsAsArr)
                .filter(_01_FilterArray::isGreaterThanThreeChars)
                .collect(Collectors.toList());

        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i) + " ");
        }
    }
}
