public class NumberReverse {

    public int reverseNumber(int number){

        int reverse = 0;
        while (number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        NumberReverse numberReverse = new NumberReverse();
        System.out.println("Result: " + numberReverse.reverseNumber(123456));
        System.out.println("2nd result: " + numberReverse.reverseNumber(57341));
    }

}
