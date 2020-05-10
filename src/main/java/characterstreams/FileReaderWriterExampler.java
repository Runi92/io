package characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExampler {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\temp\\io\\1.txt");
            FileWriter fileWriter = new FileWriter("C:\\temp\\io\\2.txt")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                fileWriter.write(c);
            }
            fileWriter.append('п');
            fileWriter.write(" Это конец файла!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
