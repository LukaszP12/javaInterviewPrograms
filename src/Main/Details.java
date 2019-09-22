package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Details {

    ArrayList list = new ArrayList();


    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        for(int i=0; i<10; i++){
            list.add(i);
        }

        list.forEach(System.out::println);

        ArrayList<Integer> intList = new ArrayList<Integer>(Collections.nCopies(10,5));
        System.out.println("ArrayList items: " + intList);


    }

}
