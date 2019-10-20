package Codility;

public class tapeEquilibrium2 {

    public static int solution(int[] A){
        int sumPre = A[0];
        int sumPost = 0;
        for (int i=1;i<A.length;i++){
            sumPost += A[i];
        }
        int difMin = Math.abs(sumPost - sumPre);
        int tempSub = 0;
        for (int i=1; i < A.length; i++){
            sumPre += A[i];
            sumPost += A[i];
            tempSub = Math.abs(sumPost - sumPre);
            if (tempSub < difMin){
                difMin = tempSub;
            }
        }

        return difMin;
    }

    public static void main(String[] args) {
        int[] A =  {3, 1, 2, 4, 3};
        System.out.println(solution(A));
    }

}
