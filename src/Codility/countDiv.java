package Codility;

public class countDiv {

    public static int solution(int A, int B, int K){

        return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);

    }

    // recurrence
    public static int divisorsInRange(int min, int max, int div){
        if(min>max){
            return 0;
        }else
        return (min%div == 0 ? 1 : 0) + divisorsInRange(min+1,max,div );
    }

    public static void main(String[] args) {
        System.out.println("The first solution");
        System.out.println(solution(6,11,2));
        System.out.println("Now the second solution with recurrence");
        System.out.println(divisorsInRange(6,11,2));
    }

}
