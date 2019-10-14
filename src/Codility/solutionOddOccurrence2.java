package Codility;

import java.util.HashMap;

public class solutionOddOccurrence2 {
    public static int solution(int[] A) {
        HashMap<Integer, Integer> occurs = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (occurs.containsKey(A[i]) && occurs.get(A[i]) == 1) {
                occurs.remove(A[i]);
            } else {
                occurs.put(A[i], 1);
            }
        }
        for (int key : occurs.keySet()) {
            {
                return key;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }

}
