import java.util.Scanner;

public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number=Integer.parseInt(scanner.next());

        for (int i = 0; i <=number ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(j+97) + " ");
            }
            System.out.println();
        }

        for (int i = number-1; i >=0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(j+97) + " ");
            }
            System.out.println();
        }
    }
}
