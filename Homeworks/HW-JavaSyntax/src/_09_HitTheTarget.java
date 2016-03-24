import java.util.Scanner;

public class _09_HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target=Integer.parseInt(scanner.next());

        for (int i = 1; i <=20; i++) {
            for (int j = 1; j <=20 ; j++) {
                if ((i+j)==target){
                    System.out.printf("%d + %d = %d", i,j,target);
                    System.out.println();
                    break;
                }
            }
        }

        for (int i = 20; i >=1 ; i--) {
            for (int j = 20; j >=1 ; j--) {
                if ((i-j)==target){
                    System.out.printf("%d - %d = %d", i,j, target);
                    System.out.println();
                    break;
                }
            }
        }
    }
}
