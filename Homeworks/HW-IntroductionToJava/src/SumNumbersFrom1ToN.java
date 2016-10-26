import java.util.Scanner;

public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = Integer.parseInt(scanner.next());

        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
