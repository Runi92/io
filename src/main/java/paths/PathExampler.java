package paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExampler {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\temp\\io\\1.txt");
        System.out.println(path.toUri());
        System.out.println(path.isAbsolute());
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getFileSystem().getSeparator());
    }
}
