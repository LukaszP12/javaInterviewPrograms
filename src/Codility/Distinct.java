package Codility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Distinct {

    public static int solution(int[] A){

        HashSet<Integer> hashSet = new HashSet();

        for (int i : A){
            hashSet.add(i);
        }

        return hashSet.size();
    }

    public static void main(String[] args) {
        int[] A = {2,1,1,2,3,1};
        System.out.println(solution(A));
    }

}
