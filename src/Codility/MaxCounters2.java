package Codility;

import java.util.Arrays;

public class MaxCounters2 {

    static int[] count(int N,int[] tab){

        int[] result = new int[N];

        int level = 0;
        int max = 0;
        boolean previousMax = false;

        for (int i : tab){
            if (i == N + 1){
                if (!previousMax){
                    level = level + max;
                    max = 0;
                    result = new int[N];
                    previousMax = true;
                }
            }else {
                result[i-1]++;
                max = Math.max(max, result[i-1]);
                previousMax = false;
            }
        }

        // adding final level (containing all the maxes)
        for (int i=0; i<result.length;i++){
            result[i] += level;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] testData = {3,4,4,6,1,4,4};

        System.out.println(Arrays.toString(count(5,testData)));

    }

}
