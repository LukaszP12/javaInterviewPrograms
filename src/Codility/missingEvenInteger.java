package Codility;

public class missingEvenInteger {

    public static int solution(int[] A){
        int maxSize = 100000;
        int[] counter = new int[maxSize];

        for (int i : A){
            if (i>0 && i<maxSize){
                counter[i-1]++;
            }
        }

        for (int i : A){
            if(counter[i] == 0 && (i+1)%2 == 0){
                return i + 1;
            }
        }

        return maxSize-1;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 6, 4, 1};
        System.out.println(solution(a));

        int b[] = {1,2,3,5,6,7,8};
        System.out.println(solution(b));

    }

}
