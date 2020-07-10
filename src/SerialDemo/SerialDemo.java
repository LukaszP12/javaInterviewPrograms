package SerialDemo;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

    public static void main(String[] args) throws Exception {
        Save obj = new Save();
        obj.i = 4;

        File file = new File("demo1.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
    }

}
