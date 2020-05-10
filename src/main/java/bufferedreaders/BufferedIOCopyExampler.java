package bufferedreaders;

import java.io.*;

public class BufferedIOCopyExampler {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\temp\\io\\1.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\temp\\io\\2.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedWriter.write("Новая строка");
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
