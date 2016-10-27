import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicMarkupLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int lineCount = 0;
        String command;
        String content = "";
        String value = "";
        String resultContent = "";
        int repeatCount = 0;

        while (true) {

            if (line.equals("<stop/>")) {
                break;
            }

            Pattern commandPat = Pattern.compile("\\s*<\\s*(repeat|reverse|inverse)");
            Matcher commandMatch = commandPat.matcher(line);

            Pattern contentPat = Pattern.compile("content\\s*=\\s*\"\\s*(\\w*\\s*\\t*)\\s*\"");
            Matcher contentMatch = contentPat.matcher(line);

            Pattern valuePat = Pattern.compile("value=\\s*\"\\s*(\\d+)\\s*\"");
            Matcher valueMatch = valuePat.matcher(line);

            while (commandMatch.find()) {
                command = commandMatch.group(1);

                if (contentMatch.find()) {
                    content = contentMatch.group(1);
                }

                if (valueMatch.find()) {
                    value = valueMatch.group(1);
                }

                if (command.equals("inverse")) {
                    if (content.equals("\\s*\\t+")) {
                        lineCount += 1;

                        System.out.printf("%d.", lineCount);
                        System.out.println();

                    } else if (!content.equals("")) {
                        lineCount += 1;

                        for (int i = 0; i < content.length(); i++) {
                            if (content.charAt(i) >= 65 && content.charAt(i) <= 90) {
                                resultContent += (char) ((content.charAt(i) + 32));
                            } else if (content.charAt(i) >= 97 && content.charAt(i) <= 122) {
                                resultContent += (char) ((content.charAt(i) - 32));
                            } else {
                                resultContent += (char) (content.charAt(i));
                            }
                        }

                        System.out.printf("%d. %s", lineCount, resultContent);
                        System.out.println();

                        resultContent = "";
                    }
                } else if (command.equals("reverse")) {
                    if (content.equals("\\s*\\t+")) {
                        lineCount += 1;

                        System.out.printf("%d.", lineCount);
                        System.out.println();

                    } else if (!content.equals("")) {
                        lineCount += 1;

                        for (int i = content.length() - 1; i >= 0; i--) {
                            resultContent += (char) content.charAt(i);
                        }

                        System.out.printf("%d. %s", lineCount, resultContent);
                        System.out.println();

                        resultContent = "";
                    }
                } else if (command.equals("repeat")) {
                    if (value.equals("")) {
                        repeatCount = 0;
                    } else {
                        repeatCount = Integer.parseInt(value);
                    }

                    for (int i = 0; i < repeatCount; i++) {
                        lineCount += 1;

                        System.out.printf("%d. %s", lineCount, content);
                        System.out.println();
                    }

                    content = "";
                }
            }

            line = sc.nextLine();
        }
    }
}
