import java.util.Scanner;

public class _10_CharacterMultiplier {
    public static int Multiplier(String firstStr, String secondStr){
        int firstStrLength=firstStr.length();
        int secondStrLength=secondStr.length();
        int minStrLength=Math.min(firstStrLength, secondStrLength);
        int sum=0;

        for (int i = 0; i < minStrLength; i++) {
            sum+=(firstStr.charAt(i)*secondStr.charAt(i));
        }

        if (firstStrLength>secondStrLength){
            for (int i = minStrLength; i <firstStrLength ; i++) {
                sum+=firstStr.charAt(i);
            }
        }else if (secondStrLength>firstStrLength){
            for (int i = minStrLength; i <secondStrLength ; i++) {
                sum+=secondStr.charAt(i);
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter two strings separated by a space: ");
        String firstString=scanner.next();
        String secondString=scanner.next();

        System.out.println(Multiplier(firstString, secondString));
    }
}
