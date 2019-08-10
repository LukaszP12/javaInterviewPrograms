// A program to swap or exchange two numbers. You should
// not use any temporary or third variable to swap.

public class MySwapingTwoNumbers {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("y value: "+y);
        System.out.println("x value: "+x);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap");
        System.out.println("y value: "+y);
        System.out.println("x value: "+x);
    }

}
