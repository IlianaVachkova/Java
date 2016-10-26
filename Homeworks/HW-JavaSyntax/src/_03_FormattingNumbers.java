import java.util.Scanner;

public class _03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int a = Integer.parseInt(scanner.next());
        System.out.print("Enter two floating-point numbers separated with space: ");
        double b = Double.parseDouble(scanner.next());
        double c = Double.parseDouble(scanner.next());

        String aInHex = Integer.toHexString(a).toUpperCase();
        String aInBinary = Integer.toBinaryString(a);
        int aBinaryInt = Integer.parseInt(aInBinary);

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", aInHex, aBinaryInt, b, c);
    }
}
