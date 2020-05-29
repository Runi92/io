package serialization;

import java.io.*;

public class Getter {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:\\temp\\io\\1.txt")))) {
            Signal signal = (Signal) objectInputStream.readObject();
            System.out.println(signal.getTagret());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
