import java.util.Scanner;

public class TinySporebat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int health = 5800;
        int glowcaps = 0;
        String line = sc.nextLine();

        while (!line.equals("Sporeggar") && health > 0) {

            for (int i = 0; i < line.length(); i++) {
                if (i == line.length() - 1) {
                    glowcaps += line.charAt(line.length() - 1) - '0';
                } else {
                    if (line.charAt(i) == 'L') {
                        health += 200;
                    } else {
                        health -= line.charAt(i);
                        if (health <= 0) {
                            break;
                        }
                    }
                }
            }

            line = sc.nextLine();
        }

        if (health > 0) {
            System.out.printf("Health left: %d\n", health);

            if (glowcaps >= 30) {
                System.out.printf("Bought the sporebat. Glowcaps left: %d\n", (glowcaps - 30));
            } else if (glowcaps < 30) {
                System.out.printf("Safe in Sporeggar, but another %d Glowcaps needed.\n", (30 - glowcaps));
            }
        } else if (health <= 0) {
            System.out.printf("Died. Glowcaps: %d\n", glowcaps);
        }
    }
}

