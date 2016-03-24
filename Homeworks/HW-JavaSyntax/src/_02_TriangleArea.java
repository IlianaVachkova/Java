import java.util.Scanner;

public class _02_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the coordinates of first point: ");
        int firstPointFirstCoordinate=Integer.parseInt(scanner.next());
        int firstPointSecondCoordinate=Integer.parseInt(scanner.next());
        System.out.print("Enter the coordinates of second point: ");
        int secondPointFirstCoordinate=Integer.parseInt(scanner.next());
        int secondPointSecondCoordinate=Integer.parseInt(scanner.next());
        System.out.print("Enter the coordinates of third point: ");
        int thirdPointFirstCoordinate=Integer.parseInt(scanner.next());
        int thirdPointSecondCoordinate=Integer.parseInt(scanner.next());

        int area=Math.abs((firstPointFirstCoordinate*(secondPointSecondCoordinate-thirdPointSecondCoordinate)
                    +secondPointFirstCoordinate*(thirdPointSecondCoordinate-firstPointSecondCoordinate)
                    +thirdPointFirstCoordinate*(firstPointSecondCoordinate-secondPointSecondCoordinate))/2);
        System.out.println(area);
    }
}
