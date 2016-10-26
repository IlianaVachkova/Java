import java.util.Random;
import java.util.Scanner;

public class _07_RandomNumberFromNToM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer numbers separated with a space: ");
        int firstRange = Integer.parseInt(scanner.next());
        int secondRange = Integer.parseInt(scanner.next());

        int low = Math.min(firstRange, secondRange);
        int high = Math.max(firstRange, secondRange);

        for (int i = 0; i <= (high - low); i++) {
            Random rand = new Random();
            int result = rand.nextInt((high - low) + 1) + low;
            System.out.print(result + " ");
        }
    }
}
