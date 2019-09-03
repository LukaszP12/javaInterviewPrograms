package Recursion;

/* We refer to a recursive function as tail-recursion when the recursive call is the last thing that function executes. Otherwise, it's known as head-recursion. */

public class tailSum {

    public static void main(String[] args) {
            tailSum tailSum = new tailSum();
            int result = tailSum.tailSum(20, 5);
            System.out.println("The result is : "  + result);

            int result_tailSum = tailSum.iterativeSum(10);
            System.out.println("The result of iterative sum is " + result_tailSum);

            int result_tailSum_Minus = tailSum.iterativeSum(-5);
            System.out.println("What happens when then input is below -5: "  + result_tailSum_Minus);

            int resultOfPoweringTo10 = tailSum.powerOf10(4);
            System.out.println("10 to the power of 4 is: " + resultOfPoweringTo10);
    }

    public int tailSum(int currentSum, int n){
        if(n <= 1){
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    //iterative sum
    public int iterativeSum(int n){
        int sum = 0;
        if(n<0){
            return -1;
        }
        for (int i=0; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    // The power of 10
    public int powerOf10(int n){
        if(n == 0) {return  1; }
        return powerOf10(n - 1) * 10;
    }

}
