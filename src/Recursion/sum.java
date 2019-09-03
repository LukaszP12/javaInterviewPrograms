package Recursion;

public class sum {

    public static void main(String[] args) {
        System.out.println("The sum of " + sum(5));
    }

    public static int sum(int n){
        if(n>=1){
            return sum(n-1) + n;
        } else {
            return n;
        }
    }

}
