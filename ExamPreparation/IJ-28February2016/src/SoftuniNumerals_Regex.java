import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniNumerals_Regex {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("aa", "0");
        dict.put("aba", "1");
        dict.put("bcc", "2");
        dict.put("cc", "3");
        dict.put("cdc", "4");

        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        String regex = "(aa|aba|bcc|cc|cdc)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            sb.append(dict.get(matcher.group()));
        }

        BigInteger number = new BigInteger(sb.toString(), 5);
        System.out.println(number);
    }
}
