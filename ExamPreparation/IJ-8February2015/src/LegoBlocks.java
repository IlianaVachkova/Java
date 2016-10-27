import java.util.Scanner;

public class LegoBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.nextLine();

        String[] firstArrAsStr = new String[rows];
        for (int i = 0; i < rows; i++) {
            firstArrAsStr[i] = sc.nextLine().trim();
        }

        String[] secondArrAsStr = new String[rows];
        for (int i = 0; i < rows; i++) {
            secondArrAsStr[i] = sc.nextLine().trim();
        }

        String[] firstArr;
        String[] secondArr;
        firstArr = firstArrAsStr[0].split("[ ]+");
        secondArr = secondArrAsStr[0].split("[ ]+");

        int cols = firstArr.length + secondArr.length;
        int cellsNum = cols;
        boolean match = false;
        int[][] matrix = new int[rows][cols];

        for (int col = 0; col < firstArr.length; col++) {
            matrix[0][col] = Integer.parseInt(firstArr[col]);
        }

        int counter = firstArr.length;
        for (int col = secondArr.length - 1; col >= 0; col--) {
            matrix[0][counter] = Integer.parseInt(secondArr[col]);
            counter += 1;
        }

        //after counting the cols
        for (int i = 1; i < rows; i++) {
            firstArr = firstArrAsStr[i].split("[ ]+");
            secondArr = secondArrAsStr[i].split("[ ]+");

            cellsNum += firstArr.length;
            cellsNum += secondArr.length;

            if ((firstArr.length + secondArr.length) == cols) {
                match = true;

                for (int col = 0; col < firstArr.length; col++) {
                    matrix[i][col] = Integer.parseInt(firstArr[col]);
                }

                counter = firstArr.length;
                for (int col = secondArr.length - 1; col >= 0; col--) {
                    matrix[i][counter] = Integer.parseInt(secondArr[col]);
                    counter += 1;
                }
            } else {
                match = false;
            }
        }

        if (match) {
            for (int i = 0; i < rows; i++) {
                System.out.print("[");
                for (int j = 0; j < cols; j++) {
                    if (j != cols - 1) {
                        System.out.printf("%d, ", matrix[i][j]);
                    } else {
                        System.out.print(matrix[i][j]);
                    }
                }
                System.out.print("]");
                System.out.println();
            }
        } else {
            System.out.printf("The total number of cells is: %d", cellsNum);
        }
    }
}
