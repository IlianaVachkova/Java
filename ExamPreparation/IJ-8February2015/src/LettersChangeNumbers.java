import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] stringsArr = line.split("[ \t\r\n]+");

        double result = 0;
        String currentWord = "";
        Character firstLetter, lastLetter;
        double number = 0;

        for (int i = 0; i < stringsArr.length; i++) {
            currentWord = stringsArr[i];
            number = Double.parseDouble(stringsArr[i].substring(1, stringsArr[i].length() - 1));
            firstLetter = stringsArr[i].charAt(0);
            lastLetter = stringsArr[i].charAt(stringsArr[i].length() - 1);

            if (firstLetter >= 65 && firstLetter <= 90) {
                number = number / (firstLetter - 64);
            } else if (firstLetter >= 97 && firstLetter <= 122) {
                number = number * (firstLetter - 96);
            }

            if (lastLetter >= 65 && lastLetter <= 90) {
                number = number - (lastLetter - 64);
            } else if (lastLetter >= 97 && lastLetter <= 122) {
                number = number + (lastLetter - 96);
            }

            result += number;
        }

        System.out.printf("%.2f", result);
    }
}
