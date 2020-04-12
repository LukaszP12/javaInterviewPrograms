package Codility;

import java.util.HashSet;

public class permCheck3 {

    public static void main(String[] args) {
        int tab[] = new int[]{1,2,4};
        System.out.println(solution(tab));

        int tab1[] = new int[]{1,2,3,4};
        System.out.println(solution(tab1));
    }

    public static boolean solution(int arr[]){

        HashSet result = new HashSet();

        // checking if all elements are unique
        for (int i=0;i<arr.length;i++){
            if (result.add(arr[i]) == false)
                return false;
        }

        // the size of the result list varies from the array length
        if (result.size() != arr.length)
            return false;

        for (int i=1; i<arr.length+1;i++)
            if (!result.contains(i))
                return false;


        return true;
    }

}
