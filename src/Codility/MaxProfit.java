package Codility;

public final class MaxProfit {

    public static int solution(final int[] A){
        if(A.length < 2){
            return 0;
        }
        int minBuy = A[0];
        int maxProfit = 0;

        for (int i=1; i<A.length; i++){
            final int value = A[i];
            maxProfit = Math.max(maxProfit,value - minBuy);
            minBuy = Math.min(minBuy, value);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int A[] = {23171,21011,21123,21366,21013,21367};
        System.out.println(solution(A));
    }

}
