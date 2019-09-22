package BigInteger;

import java.math.BigInteger;

public class GFG {

    public static void main(String[] args) {
        // BigInteger object to store result
        BigInteger sum;

        // Two objects of String created
        // Holds the values to calculate the sum
        String input1 = "5454564684456454684646454545";
        String input2 = "4256456484464684864864864864";

        // Convert the string input to BigInteger
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);

        // using add() method
        sum = a.add(b);

        // Display the result in BigInteger
        System.out.println("The sum of\n"
                            + a + " \nand\n" + b + " "
                            + "\nis\n" + sum + "\n");
    }
}
