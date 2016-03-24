import java.util.Scanner;

public class _04_CalculateExpression {
    public static double power(double base, int step){
        double result=1;
        for (int i = 0; i <step ; i++) {
            result*=base;
        }

        return result;
    }

    public static double averageNumbers(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static double averageResuls(double result1, double result2){
        return (result1+result2)/2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter three floating-point numbers separated with a space: ");
        double a=Double.parseDouble(scanner.next());
        double b=Double.parseDouble(scanner.next());
        double c=Double.parseDouble(scanner.next());

        double expression1=(power(a,2)+power(b,2))/(power(a,2)-power(b,2));
        double step1=(a+b+c)/Math.sqrt(c);
        double result1=Math.pow(expression1, step1);

        double expression2=power(a,2)+power(b,2)-power(c,3);
        double step2=a-b;
        double result2=Math.pow(expression2, step2);

        double diff=Math.abs(averageNumbers(a,b,c)-averageResuls(result1, result2));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", result1, result2, diff);
    }
}
