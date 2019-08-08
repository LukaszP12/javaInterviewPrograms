// Program converts decimal number to binary format using numeric operation

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        int number, i=0;
        int binary[] = new int[100];
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter decimal number");
        number = user_input.nextInt();

        while (number != 0){
            binary[i]=number%2; // every time remainder is calculated it will be 0 or 1
            number=number/2;
            i++;
        }

        System.out.println("Binary value is : ");
        for(int j=i-1; j>=0; j--)
        {
            System.out.println(""+binary[j]);
        }

    }

}