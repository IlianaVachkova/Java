import java.util.Scanner;

public class _11_GetFirstOddOrEvenElements {
    public static void GetOddOrEvenElements(String inputNumbers, String inputCommand) {
        String[] inputNumbersAsArr = inputNumbers.split(" ");
        int[] integers = new int[inputNumbersAsArr.length];
        for (int i = 0; i < inputNumbersAsArr.length; i++) {
            integers[i] = Integer.parseInt(inputNumbersAsArr[i]);
        }

        String[] inputCommandAsArr=inputCommand.split(" ");
        int sequenceLength=Integer.parseInt(inputCommandAsArr[1]);
        String oddOrEven=inputCommandAsArr[2];

        if (oddOrEven.equals("odd")){
            int countOddNumbers=0;
            for (int i = 0; i < integers.length ; i++) {
                if (countOddNumbers==sequenceLength) {
                    break;
                }

                if (integers[i]%2==1){
                    countOddNumbers+=1;
                    System.out.print(integers[i] + " ");
                }
            }
        } else if (oddOrEven.equals("even")) {
            int countEvenNumbers=0;
            for (int i = 0; i < integers.length; i++) {
                if (countEvenNumbers==sequenceLength) {
                    break;
                }

                if (integers[i]%2==0){
                    countEvenNumbers+=1;
                    System.out.print(integers[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers separated with a space: ");
        String firstLineNumbers = scanner.nextLine();
        System.out.print("Enter a command: ");
        String secondLineCommand=scanner.nextLine();

        GetOddOrEvenElements(firstLineNumbers, secondLineCommand);
    }


}
