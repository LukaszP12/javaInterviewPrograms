package Codility;

import java.sql.Array;
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

    static int countDistinct(int arr[]){

        int n = arr.length;

        Arrays.sort(arr);

        //Traverse the sorted array
        int res = 0;

        for (int i=0; i<n;i++){
            while (i<n-1 && arr[i] == arr[i+1]){
                i++;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {2,1,1,2,3,1};
        System.out.println(solution(A));

        System.out.println("Second method");
        System.out.println(countDistinct(A));
    }

}
