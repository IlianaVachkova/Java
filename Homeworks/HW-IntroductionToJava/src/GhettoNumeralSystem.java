import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = Integer.parseInt(scanner.next());

        int digit;
        String result = "";

        if (number == 0) {
            result = "Gee";
        }

        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            switch (digit) {
                case 0:
                    result = "Gee" + result;
                    break;
                case 1:
                    result = "Bro" + result;
                    break;
                case 2:
                    result = "Zuz" + result;
                    break;
                case 3:
                    result = "Ma" + result;
                    break;
                case 4:
                    result = "Duh" + result;
                    break;
                case 5:
                    result = "Yo" + result;
                    break;
                case 6:
                    result = "Dis" + result;
                    break;
                case 7:
                    result = "Hood" + result;
                    break;
                case 8:
                    result = "Jam" + result;
                    break;
                case 9:
                    result = "Mack" + result;
                    break;
            }
        }

        System.out.println(result);
    }
}
