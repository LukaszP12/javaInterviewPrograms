package Codility;

import java.util.HashSet;

public class HashSetDemo {

    static void solution(int[] A){
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i=0; i<A.length; i++){
            hashSet.add(A[i]);
        }

        hashSet.stream().forEach(System.out::println);

    }


    public static void main(String[] args) {
        int A[] = {1,3,1,4,2,3,5,4};

        solution(A);

    }

}
