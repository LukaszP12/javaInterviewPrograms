package Recursion;

import static java.lang.Math.max;

public class toBinary {

    public static void main(String[] args) {
        System.out.println("10 in binary format is: " + toBinary(10));
        System.out.println("20 in binary format is: " + toBinary(20));
        System.out.println("25 is binary format is: " + toBinary(25));
        System.out.println("30 in binary format is: " + toBinary(30));
        System.out.println("40 in binary format is: " + toBinary(40));


        System.out.println("Testing the powering function : " + "Powering 2^3 " + power(2,6));
        System.out.println("Powering 7^3" + "  " + power(7,3) );

        System.out.println("101 is equal to : " + fromBinary("101"));
        System.out.println("1111 is equal to : " + fromBinary("1111"));
        System.out.println("10101010 is equal to : " + fromBinary("10101010"));

        System.out.println("Binary tree tree height");


    }

    public static String toBinary(int n){
        if(n <= 1){
            return String.valueOf(n);
        }
        return toBinary(n / 2) + String.valueOf(n % 2);
    }

     public static int fromBinary(String binary) {
        int sum = 0;
        int count = 0;
        int bin = Integer.parseInt(binary);

        while (bin > 0) {

            if (bin % 2 != 0) {
                sum += power(2, count);
            }

            count++;
            bin = bin / 10;
        }
        return sum;
    }


    public static int power(int pow, int count){
        int prod = 1;
        for(int i=1; i<=count; i++){
            prod *= pow;
        }
        return prod;
    }


}