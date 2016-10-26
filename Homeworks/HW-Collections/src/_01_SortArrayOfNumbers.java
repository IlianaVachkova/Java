import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of the numbers:");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a sequence of numbers with given from you lenght:");
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
