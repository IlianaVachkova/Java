import java.util.Scanner;

public class _03_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine().toLowerCase();
        System.out.println("Enter a target word:");
        String target = scanner.nextLine().toLowerCase();
        String[] wordsArr = text.split("[^\\w]+");

        int counter = 0;
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].equals(target)) {
                counter += 1;
            }
        }

        System.out.println(counter);
    }
}
