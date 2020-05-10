package scannersprintwriters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerExampler {
    public static void main(String[] args) {
        /*            InputStream inputStream = System.in;
                    System.out.println(inputStream.read());
                    System.out.println(inputStream.read());*/
        //Это 1 сканнер 2 такой
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream).useDelimiter(Pattern.compile("[1-9]"));
        System.out.println(scanner.next());

/*        Scanner fileScanner = new Scanner(new FileInputStream("C:\\temp\\io\\1.txt"));
        System.out.println(fileScanner.next());*/
    }
}
