import java.util.ArrayList;
import java.util.Scanner;

public class _07_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter characters separated by a single space, for first array:");
        String firstLine = scanner.nextLine();
        ArrayList<Character> firstCharArr = new ArrayList<Character>();
        for (int i = 0; i < firstLine.length(); i += 2) {
            firstCharArr.add(firstLine.charAt(i));
        }

        System.out.println("Enter characters separated by a single space, for second array:");
        String secondLine = scanner.nextLine();
        ArrayList<Character> secondCharArr = new ArrayList<Character>();
        for (int i = 0; i < secondLine.length(); i += 2) {
            secondCharArr.add(secondLine.charAt(i));
        }

        boolean isContains = false;
        for (int i = 0; i < secondCharArr.size(); i++) {

            for (int j = 0; j < firstCharArr.size(); j++) {
                if (secondCharArr.get(i).equals(firstCharArr.get(j))) {
                    isContains = true;
                }
            }

            if (!isContains) {
                firstCharArr.add(secondCharArr.get(i));
            }

            isContains = false;
        }

        for (int i = 0; i < firstCharArr.size(); i++) {
            System.out.print(firstCharArr.get(i) + " ");
        }
    }
}
