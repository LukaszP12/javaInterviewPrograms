package Codility;

public class permCheck2 {

    public static boolean check(int arr[]){

        boolean result[] = new boolean[arr.length];
        for (int i=0; i < arr.length; i++){
            int index = arr[i] - 1;

            if (arr[i] > arr.length){
                return false;
            }

            if (!result[index]){
                result[index] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void diplayResult(int arr[]){
        if (permCheck2.check(arr)){
            System.out.println(arr + " jest permutacja");
        }else {
            System.out.println(arr + " nie jest permutacja");
        }
    }


    public static void main(String[] args) {
        int[] tab = new int[]{1,2,4,5};
        diplayResult(tab);

        int[] tab1 = new int[]{1,2,3,4,5};
        diplayResult(tab1);

    }

}
