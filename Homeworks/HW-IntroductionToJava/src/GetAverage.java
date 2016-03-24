import java.util.Scanner;

public class GetAverage {
    public static void GetAvarage(double a, double b, double c){
        double result=(a+b+c)/3;
        System.out.printf("The average of given three numbers is %.2f", result);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber=Double.parseDouble(scanner.next());
        System.out.print("Enter second number: ");
        double secondNumber=Double.parseDouble(scanner.next());
        System.out.print("Enter third number: ");
        double thirdtNumber=Double.parseDouble(scanner.next());

        GetAvarage(firstNumber, secondNumber, thirdtNumber);
    }
}
