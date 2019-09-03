package Main;

// Count pairs in array whose sum is divisible by K
// Given an array A[] and positive integer K, the task
// is to count total number of pairs in the array whose
// sum is divisible by K.

import Recursion.sum;

import java.util.HashMap;

import static java.lang.System.*;

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


    // Count pairs in an array such that frequency of one is at least value of other
    // Given an array A[] of integers.
    // The task is to find the total number of ordered pairs of positive integers (X, Y)
    // such that X occurs in A[] at least Y times and Y occurs in A at least X times.

    public static int countOrderedPairs(int A[], int n) {
        // Initialize pairs to 0
        int orderedPairs = 0;

        // Store frequencies
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (m.get(A[i]) == null)
                m.put(A[i], 1);
            else {
                int a = m.get(A[i]);
                m.put(A[i], ++a);
            }
        }

        //Count total Ordered_pairs
        for (int entry : m.keySet())
        {

            int X = entry;
            int Y = m.get(entry);

            for (int j = 1; j <= Y; j++)
            {
                if (m.get(j) >= X)
                    orderedPairs++;
            }
        }

        return orderedPairs;
    }



        public static void main(String[] args) {
        int A[] = {2,2,1,7,5,3};
        out.println(countKdivPairs(A, A.length, 4));
        out.println(countKdivPairs(A,A.length,3));
        out.println(countKdivPairs(A,A.length,5));

        int B[] = {1,1,7,7};

        out.println(countKdivPairs(B,B.length,4));

        int C[] = {2,2,4,4};
        out.println(countKdivPairs(C,C.length,2));
    }


}