package Recursion;

public class RecursionExample3 {

    static int factorial(int n){
        if(n == 1)
            return 1;
        else
            return(n*factorial(n-1));
    }


    //recurence
    static int factorialRecurence(int n){
        int sum = 1;
        for (int i=n; i>0 ; i--){
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("Factorial of 6 is : " + factorial(6));
        System.out.println("And now with iteration");
        System.out.println("Factorial of 5 is: " + factorialRecurence(5));
        System.out.println("Facotrial of 6 is: "  +factorialRecurence(6));
    }

}
