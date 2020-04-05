package Codility;

import java.util.Arrays;
import java.util.List;

public class cyclicRotation {

    public static int[] solution(int[] A, int k){

        int[] new_array = new int[A.length];

        for (int i=0; i<A.length;i++){
            int new_position = (i + k) % A.length;
            new_array[new_position] = A[i];
        }
        return new_array;
    }

    public static void main(String[] args) {
        int[] B = new int[]{1,2,3,4,5,6,7};

        int[] C = solution(B,2);

        for (int i : C){
            System.out.print(i + " ");
        }

    }

}
