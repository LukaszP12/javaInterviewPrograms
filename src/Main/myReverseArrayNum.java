package Main;

import java.util.*;
import java.util.stream.Collectors;

public class myReverseArrayNum {


    public static void main(String[] args) {

        System.out.println("Lets reverse a number array");

        int a[] = {1,2,3,4,5,6,7,8,9};

        reverse(a);

        Arrays.stream(a).forEach(System.out::println);

        // Collections sort
        Integer[] b = new Integer[] {3,1,7,5,11,9,7,4,6,1};

        List<Integer> list = Arrays.asList(b);
        Collections.sort(list);

        list.stream().forEach(System.out::print);

        System.out.println();

        // some lambdas operations
        //list.stream().filter(x -> x%2 == 0).map(x -> x*x).forEach(System.out::println);

        /*long count = Arrays.stream(b).filter(x -> x%2 == 0).count();
        System.out.println(count);*/

        Optional<Integer> first = list.stream().filter(x -> x % 2 == 0).findFirst();

        System.out.println(first);

        Optional<Integer> integer = list.stream().findAny();
        System.out.println(integer);

    }

    static void reverse(int a[]){
        int len = a.length;

        if (len == 0) { return; }

        for (int i=0; i<len/2; i++){
            int number = a[i];
            a[i] = a[len - i - 1];
            a[len - i - 1] = number;
        }


    }

}
