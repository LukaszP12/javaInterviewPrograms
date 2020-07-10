package SerialDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;

public class FileDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("demo.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeUTF("Demo Content");

        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);

    }

}
