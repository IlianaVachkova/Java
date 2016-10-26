import java.io.*;

public class _2_AllCapitals {
    private static final String FILE_PATH = "files/lines-zad2.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(
                new FileReader(FILE_PATH));

        String fullText = "";
        String tempStr;

        while ((tempStr = bfr.readLine()) != null) {
            fullText += tempStr.toUpperCase() + "\r\n";
        }

        PrintWriter prw = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(FILE_PATH)));

        prw.write(fullText);
        prw.flush();
        bfr.close();
        prw.close();
    }
}
