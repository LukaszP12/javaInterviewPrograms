// given that an array is sorted, and it has duplicate elements
// A program to remove duplicate elements and return new array without the duplicate elements
// The array should contain only unique elements.

public class MyDuplicateElements {

    public static int[] removeDuplicates(int[] input){

        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while (i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++i] = input[i++];
            }
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length;k++){
            output[k] = input[k];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
        int[] output = removeDuplicates(input1);
        for(int i:output){
            System.out.println(i+" ");
        }
    }

}
