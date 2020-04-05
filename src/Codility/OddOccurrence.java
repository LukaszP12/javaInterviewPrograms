package Codility;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//
public class OddOccurrence {

    static int getOddOccurrence(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }

    static void solution1(int arr[])
    {
        Set<Integer> set = new HashSet<>();

        for (int x : arr){
            if (!set.contains(x)){
                set.add(x);
            }else{
                set.remove(x);
            }
        }

        System.out.println("The elements without a pair are: ");
        set.forEach(System.out::println);
    }

    // driver code
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;
        System.out.println(getOddOccurrence(arr, n));

        System.out.println("Second solution: ");
        solution1(arr);
    }
}