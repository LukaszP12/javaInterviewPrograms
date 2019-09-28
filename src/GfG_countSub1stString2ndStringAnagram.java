public class GfG_countSub1stString2ndStringAnagram {

    /*
    Given two strings str1 and str2 of length n1 and n2 respectively.
    The problem is to count all the subsequences of str1 which are anagrams of str2.
     */

    public final static int SIZE = 26;

    // Returns value of Binomial
    // Coefficient C(n,k)
    public static int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; i++) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }

    // function to count subsequences
    // in first string which are
    // anagrams of the second string
    public static int countSubsequences(String str, String str3) {
        //hash tables to store frequencies
        //of each character
        int[] freq1 = new int[SIZE];
        int[] freq2 = new int[SIZE];

        char[] str1 = str.toCharArray();
        char[] str2 = str3.toCharArray();

        int n1 = str.length();
        int n2 = str3.length();

        //store frequency
        //of each character of str1
        for (int i = 0; i < n1; i++)
            freq1[str1[i] - 'a']++;

        // store frequency of each
        // character of 'str2'
        for (int i = 0; i < n2; i++)
            freq2[str2[i] - 'a']++;


        // to store the total count
        // of subsequences
        int count = 1;

        for (int i = 0; i < SIZE; i++) {
            // if character (i + 'a')
            // exists in 'str2'
            if (freq2[i] != 0) {

                if (freq2[i] <= freq1[i]) {
                    count = count * binomialCoeff(freq1[i], freq2[i]);
                } else
                    return 0;

            }
        }
        return count;
    }


    public static void main(String[] args) {
        String str1 = "abacd";
        String str2 = "abd";

        System.out.println("Count = " + countSubsequences(str1,str2));

    }
}