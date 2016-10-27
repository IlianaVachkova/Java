import java.math.BigInteger;
import java.util.Scanner;

public class SoftuniNumerals_ManualProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char firstSymbol;
        char secondSymbol;
        String result = "";
        int inputLen = input.length();

        int i = 0;
        while (i < inputLen - 1) {
            firstSymbol = input.charAt(i);
            secondSymbol = input.charAt(i + 1);
            if (firstSymbol == 'a') {
                if (secondSymbol == 'a') {
                    result += '0';
                    i += 2;
                } else if (secondSymbol == 'b') {
                    result += '1';
                    i += 3;
                }
            } else if (firstSymbol == 'c') {
                if (secondSymbol == 'c') {
                    result += '3';
                    i += 2;
                } else if (secondSymbol == 'd') {
                    result += '4';
                    i += 3;
                }
            } else if (firstSymbol == 'b') {
                if (secondSymbol == 'c') {
                    result += '2';
                    i += 3;
                }
            }
        }

        BigInteger decimalNum = new BigInteger(result, 5);
        System.out.println(decimalNum);
    }
}
