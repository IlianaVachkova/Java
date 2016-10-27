import java.util.Scanner;

public class GandalfStash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mood = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine().toLowerCase().trim();
        String[] foods = line.split("[^a-zA-Z]+");

        for (int i = 0; i < foods.length; i++) {
            switch (foods[i]) {
                case "cram":
                    mood += 2;
                    break;
                case "lembas":
                    mood += 3;
                    break;
                case "apple":
                    mood += 1;
                    break;
                case "melon":
                    mood += 1;
                    break;
                case "honeycake":
                    mood += 5;
                    break;
                case "mushrooms":
                    mood -= 10;
                    break;
                default:
                    mood -= 1;
                    break;
            }
        }

        System.out.println(mood);

        if (mood < -5) {
            System.out.println("Angry");
        } else if (mood >= -5 && mood <= 0) {
            System.out.println("Sad");
        } else if (mood > 0 && mood <= 15) {
            System.out.println("Happy");
        } else if (mood > 15) {
            System.out.println("Special JavaScript mood");
        }
    }
}
