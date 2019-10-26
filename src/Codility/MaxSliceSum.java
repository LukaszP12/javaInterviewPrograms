package Codility;

public class MaxSliceSum {
    public static int solution(int[] A){

        int maxEndingPrevious = A[0];
        int maxEndingHere = A[0];
        int maxSoFar = A[0];

        for (int i=1; i<A.length; i++){
            maxEndingHere = Math.max(A[i],maxEndingPrevious + A[i]);
            maxEndingPrevious = maxEndingHere;
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, -6, 4, 0};
        System.out.println(solution(A));
    }

}
