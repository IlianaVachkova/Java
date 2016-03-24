import java.util.Scanner;

public class _06_ConvertFromSevenBasedSystemToDecimal {
    public static int power(int base, int step){
        int result=1;
        for (int i = 0; i <step ; i++) {
            result*=base;
        }

        return result;
    }

    public static void convertFromOtherSystemToDecimal(int numberToBeConverted, int base){
        int convertedNumber=0;
        int baseStep=0;

        while(numberToBeConverted>0){
            convertedNumber+=numberToBeConverted%10*power(base,baseStep);
            numberToBeConverted/=10;
            baseStep+=1;
        }

        System.out.println(convertedNumber);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int numberInSevenBasedSystem=Integer.parseInt(scanner.next());

        convertFromOtherSystemToDecimal(numberInSevenBasedSystem,7);
    }
}
