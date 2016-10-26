import java.util.Scanner;

public class _04_CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        String[] wordsArr = text.split("[^\\w]+");

        System.out.println(wordsArr.length);
    }
}
