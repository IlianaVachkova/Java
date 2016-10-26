import java.io.*;

public class _1_SumLines {
    private static final String FILE_PATH = "files/lines.txt";
    private static final String SAVE_PATH = "files/output-lines-zad1.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        File outputFile = new File(SAVE_PATH);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        FileWriter fw = new FileWriter(outputFile, true);
        PrintWriter writer = new PrintWriter(fw, true);
        String line = reader.readLine();

        while (line != null) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }

            writer.println(sum);
            line = reader.readLine();
        }

        writer.close();
        reader.close();
    }
}
