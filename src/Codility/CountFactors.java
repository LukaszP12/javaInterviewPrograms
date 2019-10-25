package Codility;


public class CountFactors {
    public static int solution(int n){
        int count = 1; // bo każda liczba jest podzielna przez 1

        for (int i=1; i<=n/2; i++){
            if(n%i == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }

}
