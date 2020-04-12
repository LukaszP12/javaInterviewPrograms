package Codility;

import java.util.HashSet;
import java.util.Set;

public class permCheckHashSets {

    public static void main(String[] args) {
        int tab[] = {1,2,3};

        if (solution(tab))
            System.out.println("This is a factorial");
        else
            System.out.println("It is not a factorial");
    }

    static boolean solution(int arr[]){

        Set<Integer> result = new HashSet<>();
        Set<Integer> perfect = new HashSet<>();

        for (int i=0; i<arr.length;i++){
            result.add(arr[i]);
            perfect.add(i+1);
        }

        for (int i : perfect){
            if (!result.contains(i)){
                return false;
            }
        }

        return true;
    }

}
