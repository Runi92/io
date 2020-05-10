package bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamExampler {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\temp\\io\\1.png")) {
            int firstByte = fileInputStream.read();
            System.out.println(firstByte);

            byte[] buf = new byte[10];

            System.out.println(Arrays.toString(buf));
            fileInputStream.read(buf);
            System.out.println(Arrays.toString(buf));

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка доступа к файлу");
        } catch (IOException e) {
            System.out.println("Ошибка при считывании данных");
        }
    }
}
