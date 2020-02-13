package Codility;

public class MinPerimeterRectangle {

    public static int solution(int N){
        int minPer = Integer.MAX_VALUE;

        for (int i = 1; i*i <= N; i++){
            if(N % i == 0){
                minPer = Math.min(minPer, 2*(N/i + i));
            }
        }

        return minPer;
    }

    public static void main(String[] args) {
        solution(30);
    }

}
