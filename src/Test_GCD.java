// Greatest common divider of two numbers

public class Test_GCD {

    static int gcd(int a, int b)
    {
        //Everything divides 0
        if(a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        if(a > b)
            return gcd(a-b,b);
        return gcd(b,b-a);
    }

    static int gcd2(int a, int b){
        if (b == 0)
            return a;
        return gcd2(b,a%b);
    }

    public static void main(String[] args) {
        int a = 98, b = 56;
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a,b));

        System.out.println("With the second method " + gcd2(a,b));
    }

}
