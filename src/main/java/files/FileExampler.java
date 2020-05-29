package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileExampler {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\temp\\io\\2.txt");
        File dir = new File("C:\\temp\\io\\");
        File secondDir = new File("C:\\temp\\io");
        System.out.println(Files.isDirectory(file.toPath()));
        System.out.println(Files.isDirectory(dir.toPath()));
        System.out.println(Files.isDirectory(secondDir.toPath()));
    }
}
