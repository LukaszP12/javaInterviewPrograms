package Main;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Iterator {
    List<Integer> list;

    public static void main(String[] args) {

        ListIterator<Integer> listIterator = null;
        List<Integer> list = new LinkedList<>();

        for (int i=0; i<20; i++){
            list.add(i);
        }

        // Obtaining the list iterator
        listIterator = list.listIterator();

        // traversing the list forwards
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // traversing the list backwards
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<20; i++){
            System.out.println("Put in number: " + i);
            list.add(scanner.nextInt());
        }
        System.out.println(list);
        scanner.close();

    }




}