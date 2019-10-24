package Codility;

public class maxCounters {

    public int[] solution(int n, int[] A){

        int[] result = new int[n];

        int max = 0;
        boolean previousMax = false;

        for (int i : A){

            if (i == n+1){
                if(!previousMax){
                    //max else
                    for (int j=0;j<result.length;j++) {
                        result[j] = max;
                    }
                    previousMax = true;
                }
            }else{
                result[i-1]++;
                max = Math.max(max, result[i-1]);
                previousMax = false;
            }
        }

        return result;
    }
}
