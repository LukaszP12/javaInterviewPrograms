package Recursion;

public class Product {

    public static void main(String[] args) {
        Product product = new Product();
        int result = product.product(6);

        System.out.println("The factorial of 6! is " + result);

    }

    public int product(int n) {
        if(n == 0)
            return 1;
        else {
            return product(n - 1) * n;
        }
    }


}