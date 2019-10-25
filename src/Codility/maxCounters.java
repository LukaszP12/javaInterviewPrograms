package Codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class maxCounters {

    public static int[] solution(int n, int[] A){

        int[] result = new int[n];

        int level = 0;
        int max = 0;
        boolean previousMax = false;
        
        for (int i : A){

            if (i == n + 1){
                if(!previousMax) {
                    level = level + max;
                    max = 0;
                    result = new int[n];
                    previousMax = true;
                }
            } else {
                result[i - 1]++;
                max = Math.max(max,result[i-1]);
                previousMax = false;
            }
        }

        for (int i=0; i<result.length; i++){
            result[i] = result[i] + level;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] testData = {3,4,4,6,1,4,4};

        System.out.println(Arrays.toString(solution(5,testData)));

    }

}
