import java.util.ArrayList;
import java.util.Scanner;

public class _02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of strings separated by a space:");
        String line = scanner.nextLine();
        String[] stringsAsArr = line.split(" ");

        String currentWord;
        ArrayList<String> resultArr = new ArrayList<String>();
        ArrayList<Integer> countOfWords = new ArrayList<Integer>();
        int counterWords = 1;
        for (int i = 0; i < stringsAsArr.length; i++) {
            currentWord = stringsAsArr[i];

            for (int j = i + 1; j < stringsAsArr.length; j++) {
                if (currentWord.equals(stringsAsArr[j])) {
                    counterWords += 1;
                    stringsAsArr[j] = "";
                }
            }

            if (currentWord != "") {
                resultArr.add(currentWord);
                countOfWords.add(counterWords);
            }

            counterWords = 1;
        }

        int repeater = 0;
        for (int i = 0; i < countOfWords.size(); i++) {
            repeater = countOfWords.get(i);
            for (int j = 0; j < repeater; j++) {
                System.out.print(resultArr.get(i) + " ");
            }

            System.out.println();
        }
    }
}
