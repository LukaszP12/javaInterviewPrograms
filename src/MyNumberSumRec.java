// Sum of each digit in the given number using recursion logic.
// For example if the number is 259, then the sum should be 2 + 5 + 9

public class MyNumberSumRec {

    int sum = 0;

    public int getNumbersSum(int number){

        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumbersSum(number/10);
        }
        return sum;
    }

    public static void main(String[] args) {
        MyNumberSumRec myNumberSumRec = new MyNumberSumRec();
        System.out.println("Sum is: " + myNumberSumRec.getNumbersSum(223));
    }

}
