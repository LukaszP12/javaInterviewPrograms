package Varargs;

public class ClientTest {

    public static void main(String[] args) {

        int sum1 = sum("Calculated Sum:");
        System.out.println(sum1);

        System.out.println("--------------------");
        int sum2 = sum("Calculated Sum:",new int[]{4,5,1,10});
        System.out.println(sum2);

        System.out.println("--------------------");
        int product_of_multiplication = product("Product of multiplication", new int[]{1, 2, 5, 10});
        System.out.println(product_of_multiplication);
    }

    private static int sum(String message, int ... arr){

        System.out.println(message);
        int sum = 0;
        for (int num : arr) {
            sum = sum+num;
        }
        return sum;
    }

    private static int product(String message, int ... arr){

        System.out.println(message);
        int product = 1;
        for (int num : arr){
            product*=num;
        }
        return product;
    }


}
