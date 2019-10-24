package Codility;

import javax.sound.midi.MidiFileFormat;
import java.util.HashSet;

public class FrogRiverOne {
    public static int solution(int x, int[] A){
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i=0; i<A.length;i++){
            if (A[i] <= x){
                hashSet.add(A[i]);
            }
            if (hashSet.size()==x){
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int A[] = {1,3,1,4,2,3,5,4};
        System.out.println("The frog can cross in the " + solution(5,A) + " min");

        int B[] = {1,3,2,1,1,1,4,5,2,4};
        System.out.println("The can now cross in the " + solution(5,B) + " min");
    }

}
