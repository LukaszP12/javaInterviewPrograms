package Main;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] tab = new int[10];

       for (int i=1; i<10; i++){
           for (int j=10; j > 10-i; j--){
               tab[i]++;
           }
       }

        Arrays.stream(tab).forEach(System.out::println);

    }

}
