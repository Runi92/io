package bytestreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExampler {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\temp\\io\\4.doc")) {
            fileOutputStream.write(21);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
