import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class splitDemo {

    public static void main(String[] args) {
        String word = "00123";
        String s[] = word.split("0");

        LinkedList list = (LinkedList) Arrays.asList(s);

        for (int i=0; i< s.length; i++){
            System.out.println(s[i]);
        }

        list.forEach(System.out::println);


    }

}
