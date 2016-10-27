import java.util.Scanner;

public class RubiksMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        int commandsCount = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[rows][cols];

        int filler = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = filler;
                filler += 1;
            }
        }

        String[] command;
        int rowOrCol = 0;
        int moves = 0;
        String direction = "";
        int tempValue = 0;
        for (int i = 0; i < commandsCount; i++) {
            command = sc.nextLine().split(" ");

            rowOrCol = Integer.parseInt(command[0]);
            direction = command[1];
            moves = Integer.parseInt(command[2]);

            if (direction.equals("left")) {
                for (int m = 0; m < (moves % cols); m++) {
                    tempValue = matrix[rowOrCol][0];
                    for (int j = 0; j < cols - 1; j++) {
                        matrix[rowOrCol][j] = matrix[rowOrCol][j + 1];
                    }
                    matrix[rowOrCol][cols - 1] = tempValue;
                }
            } else if (direction.equals("right")) {
                for (int m = 0; m < (moves % cols); m++) {
                    tempValue = matrix[rowOrCol][cols - 1];
                    for (int j = cols - 1; j > 0; j--) {
                        matrix[rowOrCol][j] = matrix[rowOrCol][j - 1];
                    }
                    matrix[rowOrCol][0] = tempValue;
                }
            } else if (direction.equals("up")) {
                for (int m = 0; m < (moves % rows); m++) {
                    tempValue = matrix[0][rowOrCol];
                    for (int j = 0; j < rows - 1; j++) {
                        matrix[j][rowOrCol] = matrix[j + 1][rowOrCol];
                    }
                    matrix[rows - 1][rowOrCol] = tempValue;
                }

            } else if (direction.equals("down")) {
                for (int m = 0; m < (moves % rows); m++) {
                    tempValue = matrix[rows - 1][rowOrCol];
                    for (int j = rows - 1; j > 0; j--) {
                        matrix[j][rowOrCol] = matrix[j - 1][rowOrCol];
                    }
                    matrix[0][rowOrCol] = tempValue;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != (i * cols + j + 1)) {
                    for (int innerI = 0; innerI < rows; innerI++) {
                        for (int innerJ = 0; innerJ < cols; innerJ++) {
                            if (matrix[innerI][innerJ] == (i * cols + j + 1)) {
                                tempValue = matrix[i][j];
                                matrix[i][j] = matrix[innerI][innerJ];
                                matrix[innerI][innerJ] = tempValue;

                                System.out.printf("Swap (%d, %d) with (%d, %d)", i, j, innerI, innerJ);
                                System.out.println();

                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("No swap required");
                }
            }
        }

        //printing the matrix
        //for (int i = 0; i < rows; i++) {
        //    for (int j = 0; j < cols; j++) {
        //        System.out.print(matrix[i][j] + " ");
        //    }
        //    System.out.println();
        //}
    }
}
