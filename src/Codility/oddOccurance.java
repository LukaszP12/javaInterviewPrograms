package Codility;

import java.util.HashSet;
import java.util.Set;

public class oddOccurance {

        public int[] solution(int[] A) {
            Set<Integer> hashSet = new HashSet<Integer>();

            for (int a : A){
                if (!hashSet.contains(a)){
                    hashSet.add(a);
                }else {
                    hashSet.remove(a);
                }
            }

            int[] arr = new int[hashSet.size()];

            hashSet.toArray(new int[][]{arr});

            return arr;
        }


}
