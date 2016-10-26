import java.util.Scanner;

public class _01_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sides of a rectangle with space between them: ");
        int firstSide = Integer.parseInt(scanner.next());
        int secondSide = Integer.parseInt(scanner.next());

        int result = firstSide * secondSide;
        System.out.println(result);
    }
}
