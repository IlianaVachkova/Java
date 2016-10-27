import java.util.Map;
import java.util.Scanner;

public class ParkingSystem_FirstSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        sc.nextLine();
        String line = sc.nextLine();

        int entryRow = 0;
        int endRow = 0;
        int endCol = 0;
        int leftCol = 0;
        int rigthCol = 0;
        boolean leftFull = false;
        boolean rigthFull = false;
        while (true) {

            if (line.equals("stop")) {
                break;
            }

            entryRow = line.charAt(0) - '0';
            endRow = line.charAt(2) - '0';
            endCol = line.charAt(4) - '0';

            if (matrix[endRow][endCol] == 1) {
                leftCol = endCol;
                rigthCol = endCol;
                leftFull = false;
                rigthFull = false;

                while (matrix[endRow][leftCol] == 1 && leftCol != 1) {
                    leftCol -= 1;
                }

                if (matrix[endRow][leftCol] == 0) {
                    System.out.println(Math.abs(endRow - entryRow) + leftCol + 1);
                    matrix[endRow][leftCol] = 1;
                } else if (leftCol == 1) {
                    leftFull = true;
                }

                while (matrix[endRow][rigthCol] == 1 && leftFull && rigthCol < col - 1) {
                    rigthCol += 1;
                }

                if (matrix[endRow][rigthCol] == 0) {
                    System.out.println(Math.abs(endRow - entryRow) + rigthCol + 1);
                    matrix[endRow][rigthCol] = 1;
                } else if ((rigthCol + 1 == col) && leftCol == 1) {
                    System.out.printf("Row %d full", endRow);
                }

            } else if (matrix[endRow][endCol] == 0) {
                System.out.println(Math.abs(endRow - entryRow) + endCol + 1);
                matrix[endRow][endCol] = 1;
            }

            line = sc.nextLine();
        }
    }
}
