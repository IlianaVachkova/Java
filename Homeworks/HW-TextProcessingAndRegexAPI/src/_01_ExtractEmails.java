import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        String pattern = "[a-z.-_@a-z.a-z.a-z]+";
        Pattern emailPattern = Pattern.compile(pattern);
        Matcher matcher = emailPattern.matcher(text);
        while (matcher.find()) {
            if (matcher.group().length() == 1) {
                continue;
            }
            if (matcher.group().contains("@")) {
                System.out.println(matcher.group());
            }
        }
    }
}
