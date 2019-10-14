package Codility;
/*
A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements,
and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
 */

import java.util.HashMap;
import java.util.HashSet;

public class solutionOddOccurrence {

        public static int solution(int[] A) {
           for(int i=0;i<A.length;i++){
               if(A[i] == 0)
                   continue;
               boolean f = false;
               for (int j=i+1; j<A.length;j++){
                   if (A[0] == 0) continue;
                   if(A[i] == A[j]){
                       A[i] = A[j] = 0;
                       f = true;
                   }
               }
               if(!f)
                   return A[i];
           }
           return 0;
        }

    public static void main(String[] args){
          int[] A = {9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }

    }