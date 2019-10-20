package Codility;

import Recursion.sum;

public class tapeEquilibrium2 {

    public static int solution(int[] A){
        int sumMin = A[0];
        int sumMax = 0;

        for (int i=1; i<A.length;i++){
            sumMax += A[i];
        }

        int difMin = Math.abs(sumMin - sumMax);
        for (int i=1; i<A.length; i++){
            sumMin += A[i];
            sumMax -= A[i];
            difMin = Math.min(difMin, Math.abs(sumMin-sumMax));
        }

        return difMin;
    }

    public static void main(String[] args) {
        int[] A =  {3, 1, 4, 4, 3};
        System.out.println(solution(A));
    }

}
