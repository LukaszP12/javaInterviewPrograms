package Codility;

public class BinaryGap {

    public static int binaryGap(int n){
        int binaryGap = 0;

        if(n == 0){
            return 0;
        }

        // removing trailing zeros if not counted
        while (n % 2 == 0){
            n /= 2;
        }

        for (int j=0; n>0; n /= 2){
            if(n % 2 == 0){
                j++;
            } else {
                if(j > binaryGap){
                    binaryGap = j;
                }

                j=0;
            }
        }
        return binaryGap;
    }

    public static void main(String[] args) {
        System.out.println("The binary gap of 1110011101: " + binaryGap(1110011101));
    }

}
