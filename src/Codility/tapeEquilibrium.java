package Codility;

public class tapeEquilibrium {

    public static int solution(int[] A){

        int leftValue = 0;
        int rightValue = A[A.length-1];
        int leftCursor = 0;
        int rightCursor = A.length-1;

        while (leftCursor < rightCursor){
            int leftMoved = leftValue + A[leftCursor];
            int rightMoved = rightValue + A[rightCursor-1];

            if (Math.abs(leftMoved-rightValue) < Math.abs(rightMoved-leftValue)) {
                leftValue = leftValue + A[leftCursor];
                leftCursor++;
            }else{
                rightValue = rightValue + A[rightCursor - 1];
                rightCursor--;
            }

        }

        return Math.abs(leftValue-rightValue);
    }

    public static void main(String[] args) {

        int []A = new int[]{3, 1, 2, 4, 3};

        System.out.println(solution(A));
    }

}
