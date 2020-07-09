package Varargs;

public class CalcDemo {

    // if we put the .. and variable then it does not matter how many parameters we pass
    // the parameters we reach as an array
    public int add(int ... n){
        int sum=0;
        for (int i : n)
        {
            sum = sum + i;
        }
        return sum;
    }

    public int multiply(int ... n){
        int product=1;
        for (int i : n)
        {
            product = product*=i;
        }
        return product;
    }

    public static void fun(int ... a){

    }


}
