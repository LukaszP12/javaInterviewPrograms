public class MyDisticntElements {

    public static void printDistinctElement(int[] arr){

        for(int i = 0; i<arr.length; i++){
            boolean isDistinct = false;
            for (int j = 0; j<i; j++){
                if (arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct){
                System.out.println(arr[i] + " ");
            }
        }

    }


    public static void main(String[] args) {
        int[] nums = {5,2,7,2,4,7,8,2,3};
        printDistinctElement(nums);
    }

}
