import java.util.Scanner;

public class _08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers separated with a space: ");
        String inputAsString = scanner.nextLine();
        String[] inputAsArr = inputAsString.split(" ");
        int[] integers = new int[inputAsArr.length];

        for (int i = 0; i < inputAsArr.length; i++) {
            integers[i] = Integer.parseInt(inputAsArr[i]);
        }

        if (integers.length % 2 == 1) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < integers.length; i += 2) {
                if (integers[i] % 2 == 0 && integers[i + 1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even", integers[i], integers[i + 1]);
                    System.out.println();
                } else if (integers[i] % 2 == 1 && integers[i + 1] % 2 == 1) {
                    System.out.printf("%d, %d -> both are odd", integers[i], integers[i + 1]);
                    System.out.println();
                } else {
                    System.out.printf("%d, %d -> different", integers[i], integers[i + 1]);
                    System.out.println();
                }
            }
        }
    }
}
