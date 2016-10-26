import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _4_CopyJpgFile {
    private static final String FILE_PATH = "files/bunny.jpg";
    private static final String SAVE_PATH = "files/bunny-copy.jpg";

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        FileOutputStream fos = new FileOutputStream(SAVE_PATH);
        int byteContainer;
        while ((byteContainer = fis.read()) != -1) {
            fos.write(byteContainer);
        }
        fis.close();
        fos.close();
    }
}
