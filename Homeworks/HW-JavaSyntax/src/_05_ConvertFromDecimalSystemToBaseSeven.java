import java.util.Scanner;

public class _05_ConvertFromDecimalSystemToBaseSeven {
    public static void convertFromDecimalToOtherSystem(int numberToBeConverted, int base) {
        String convertedNumber = "";

        while (numberToBeConverted > 0) {
            convertedNumber = numberToBeConverted % base + convertedNumber;
            numberToBeConverted /= base;
        }

        System.out.println(convertedNumber);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int numberInDecimalSystem = Integer.parseInt(scanner.next());

        convertFromDecimalToOtherSystem(numberInDecimalSystem, 7);
    }
}
