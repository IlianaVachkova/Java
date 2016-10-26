import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of string separated by a space: ");
        String line = scanner.nextLine();
        String[] stringsAsArr = line.split(" ");

        int maxLenght = 1;
        int currentLenght = 1;
        int endPosition = 0;
        String currentWord = stringsAsArr[0];
        for (int i = 1; i < stringsAsArr.length; i++) {
            if (currentWord.equals(stringsAsArr[i])) {
                currentLenght += 1;
            } else {
                if (currentLenght > maxLenght) {
                    maxLenght = currentLenght;
                    endPosition = i;
                }
                currentLenght = 1;
                currentWord = stringsAsArr[i];
            }
        }

        int position = endPosition - maxLenght;
        for (int i = 0; i < maxLenght; i++) {
            System.out.print(stringsAsArr[position] + " ");
        }
    }
}
