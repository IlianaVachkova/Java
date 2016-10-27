import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputAsArr = input.split(", ");
        String[] resultNum = new String[inputAsArr.length];

        String numWithWords = "";
        String currentNum = "";
        for (int i = 0; i < inputAsArr.length; i++) {
            currentNum = inputAsArr[i];

            for (int j = 0; j < currentNum.length(); j++) {

                switch (currentNum.charAt(j)) {
                    case '0':
                        numWithWords += "zero-";
                        break;
                    case '1':
                        numWithWords += "one-";
                        break;
                    case '2':
                        numWithWords += "two-";
                        break;
                    case '3':
                        numWithWords += "three-";
                        break;
                    case '4':
                        numWithWords += "four-";
                        break;
                    case '5':
                        numWithWords += "five-";
                        break;
                    case '6':
                        numWithWords += "six-";
                        break;
                    case '7':
                        numWithWords += "seven-";
                        break;
                    case '8':
                        numWithWords += "eight-";
                        break;
                    case '9':
                        numWithWords += "nine-";
                        break;
                }
            }

            resultNum[i] = numWithWords;
            numWithWords = "";
        }

        Arrays.sort(resultNum);
        String[] digit;
        String result = "";
        int number;
        for (int i = 0; i < resultNum.length; i++) {
            currentNum = resultNum[i];
            digit = currentNum.split("-");

            for (int j = 0; j < digit.length; j++) {
                switch (digit[j]) {
                    case "zero":
                        result += '0';
                        break;
                    case "one":
                        result += '1';
                        break;
                    case "two":
                        result += '2';
                        break;
                    case "three":
                        result += '3';
                        break;
                    case "four":
                        result += '4';
                        break;
                    case "five":
                        result += '5';
                        break;
                    case "six":
                        result += '6';
                        break;
                    case "seven":
                        result += '7';
                        break;
                    case "eight":
                        result += '8';
                        break;
                    case "nine":
                        result += '9';
                        break;
                }
            }

            if (!result.equals("")) {
                number = Integer.parseInt(result);

                if (i == resultNum.length - 1) {
                    System.out.printf("%d", number);
                } else {
                    System.out.printf("%d, ", number);
                }
            }

            result = "";
        }
    }
}
