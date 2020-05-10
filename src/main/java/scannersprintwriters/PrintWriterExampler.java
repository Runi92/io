package scannersprintwriters;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExampler {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\temp\\io\\1.txt"))) {
            // [09.05.2020 14:33:38:381] ThreadName E Ошибка при регистрации пользователя Ivan - имя пустое
            // dateTime + Thread.name() + MessageTYPE + "Ошибка при регистрации пользователя" + login + "-" + e.getMessage
            String login = "Ivan";
            printWriter.printf("Ошибка при регистрации пользователя %s", login);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
