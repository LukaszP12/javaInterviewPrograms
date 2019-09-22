public class GFG_isPalindrome {

    // Function that returns true if
    // str is palidrome
    static boolean isPalindrome(String string){
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = string.length() - 1;

        while (i < j) {

            // if there is a mismatch
            if(string.charAt(i) != string.charAt(j))
                return false;

            i++;
            j--;
        }

        //Given string is a palindrome
        return true;
    }


    // Function to return the maximum
    // absolute difference between
    // any two elements of the array
    static int maxAbsDiff(int arr[], int n) {
        // To store the minimum and maximum
        // elements from the array
        int minEle = arr[0];
        int maxEle = arr[0];
        for (int i = 0; i < n; i++) {
            minEle = Math.min(minEle, arr[i]);
            maxEle = Math.max(maxEle, arr[i]);
        }
        return maxEle - minEle;
    }

    public static void main(String[] args) {
        String str = "geeks";

        if(isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");


        System.out.println("Counting the min & max elements");
        int[] arr = {2, 1, 5, 3};
        int n = arr.length;
        System.out.println(maxAbsDiff(arr,n));
    }

}