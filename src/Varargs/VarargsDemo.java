package Varargs;
//
//Varargs can used when we are unsure about the numbers of arguments to be
//passed in a method. It creates an array of parameters of unspecified length
//in the background and such a parameter can be treated as an array in runtime.

public class VarargsDemo {

    public static void main(String[] args) {
        CalcDemo obj = new CalcDemo();
        System.out.println(obj.add(4, 5,6,7,8,9,10,11,12,14,16));
        System.out.println(obj.multiply(2,3,4));
    }

}
