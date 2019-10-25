package Codility;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public static int solution(int[] A){
        // Using "hashMap" for counting
        Map<Integer,Integer> map = new HashMap<>();

        // 1. Counting
        // map(key,value) ---> map(number, count)
        for (int i=0;i<A.length;i++){
            if (!map.containsKey(A[i])){
                map.put(A[i],1);
            }else {
                int count = map.get(A[i]);
                map.put(A[i],count+1);
            }
        }

        // 2. find the max of counts
        int max_Number = 0;
        int max_Count = 0;

        for (int key : map.keySet()){
            int cur_Count = map.get(key);
            if (cur_Count > max_Count){
                max_Count = cur_Count;
                max_Number = key;
            }
        }

        // 3. check if there is a dominator or not
        if (max_Count > (A.length)/2){

        }else {
            return -1;
        }

        // 4. return "any index" of "the dominator"
        for (int i=0; i<A.length;i++){
            if(A[i] == max_Number){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int A[] = {3,4,3,2,3,-1,3,3};
        System.out.println("The dominating value is : " + A[solution(A)]);
    }

}
