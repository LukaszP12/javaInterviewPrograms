package Main;

// Count pairs in array whose sum is divisible by K
// Given an array A[] and positive integer K, the task
// is to count total number of pairs in the array whose
// sum is divisible by K.

public class Count {

    public static int countKdivPairs(int A[], int n, int K)
    {
        //frequency of occurance array
        int freq[] = new int [K];

        // counting the reminders of elements in the array
        for (int i = 0; i< n; i++){
            ++freq[A[i] % K];
        }

        // if both pairs are divisible by 'K'
        int sum = A[0] * (A[0] - 1) / 2;

        //
        for(int i=1; i <= K/2 & i != (K-i); i++)
            sum = freq[i] * freq[K - i];
        //if K is even
        if(K % 2 == 0)
            sum += (freq[K/2] * (freq[K/2] - 1) / 2);

        return sum;
    }

    public static void main(String[] args) {
        int A[] = {2,2,1,7,5,3};
        System.out.println(countKdivPairs(A, A.length, 4));
        System.out.println(countKdivPairs(A,A.length,3));
        System.out.println(countKdivPairs(A,A.length,5));
    }


}