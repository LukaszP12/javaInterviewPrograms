package Codility;

public class ChocolatesByNumbers {
    public int solution(int n, int m){
        int[] X = new int[n];
        int i = 0;
        int count = 0;

        while (X[i] == 0)
        {
            X[i] = 1;
            i = (i + m) % n;
            count++;
        }
        return count;
    }

}
