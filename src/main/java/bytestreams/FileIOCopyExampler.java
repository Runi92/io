package bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOCopyExampler {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\temp\\io\\1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\temp\\io\\2.txt")) {
            int c;
            // 10101010 10101000
            while ((c = fileInputStream.read()) != -1 ) {
                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
