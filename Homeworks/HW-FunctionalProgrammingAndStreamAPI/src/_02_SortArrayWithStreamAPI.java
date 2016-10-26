import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers separated by a space:");
        String text = scanner.nextLine();
        System.out.println("Sorting order:");
        String sortingOrder = scanner.nextLine();
        String[] numbersAsArr = text.split(" ");

        List<Integer> numbers = new ArrayList<Integer>();

        if (sortingOrder.equals("Ascending")) {
            numbers = Arrays.stream(numbersAsArr)
                    .map(Integer::parseInt)
                    .sorted((f1, f2) -> Integer.compare(f1, f2))
                    .collect(Collectors.toList());
        } else if (sortingOrder.equals("Descending")) {
            numbers = Arrays.stream(numbersAsArr)
                    .map(Integer::parseInt)
                    .sorted((f1, f2) -> Integer.compare(f2, f1))
                    .collect(Collectors.toList());
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
