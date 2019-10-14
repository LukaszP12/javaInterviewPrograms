package Codility;

import java.util.Arrays;

public class shiftingKelements {

    public static int[] solution(int[] A, int k){
        if(k == 0 || A.length == 0)
            return A;

        int length = A.length;
        int[] res = new int[length];

        for(int i=0;i<length;i++){
            res[(i+k)%length] = A[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] example = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(solution(example, 3)));
    }

}