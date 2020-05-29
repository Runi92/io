package serialization;

import java.io.*;
import java.util.Date;

public class Sender {
    public static void main(String[] args) {
        Signal signal = new Signal(1, "/home/", new Date());
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\temp\\io\\1.txt")))) {
            objectOutputStream.writeObject(signal);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
