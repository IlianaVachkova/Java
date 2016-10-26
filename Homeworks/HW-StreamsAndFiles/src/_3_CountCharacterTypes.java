import java.io.*;

public class _3_CountCharacterTypes {
    private static final String FILE_PATH = "files/words.txt";
    private static final String SAVE_PATH = "files/count-chars.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        File outputFile = new File(SAVE_PATH);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        FileWriter fw = new FileWriter(outputFile, true);
        PrintWriter writer = new PrintWriter(fw, true);
        String line = reader.readLine();

        String vowelsSymbols = "aeiou";
        String punctuationSymbols = "!.,?";

        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation = 0;
        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                if (vowelsSymbols.contains(line.charAt(i) + "")) {
                    countVowels++;
                } else if (punctuationSymbols.contains(line.charAt(i) + "")) {
                    countPunctuation++;
                } else if (Character.isLetter(line.charAt(i))) {
                    countConsonants++;
                }
            }

            line = reader.readLine();
        }

        writer.write(String.format("Vowels: %d%n", countVowels));
        writer.write(String.format("Vowels: %d%n", countConsonants));
        writer.write(String.format("Vowels: %d%n", countPunctuation));

        writer.close();
        reader.close();
    }
}
