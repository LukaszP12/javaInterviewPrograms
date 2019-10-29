package Codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProductOfThree {

    public static int solution(int[] A){

        int n = A.length;
        Arrays.sort(A);


        return Math.max(A[n-1] * A[n-2] * A[n-3], A[0] * A[1] * A[n-1]);

    }

    public static void main(String[] args) {
        int[] A = {-3,1,2,-2,5,6};
        System.out.println(solution(A));


        int[] B = {1,2,3,-8,-9,-10};
        System.out.println("The second result is: " + solution(B));

    }

}
