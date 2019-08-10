public class MyPrimeNumCheck {

    // the program checks if the a number is prime
    public boolean isPrimeNumber(int number){

        for (int i=2; i<number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MyPrimeNumCheck myPrimeNumCheck = new MyPrimeNumCheck();
        System.out.println("Is 17 prime number? " + myPrimeNumCheck.isPrimeNumber(17));
        System.out.println("Is 19 prime number? " + myPrimeNumCheck.isPrimeNumber(19));
        System.out.println("Is 15 prime number? " + myPrimeNumCheck.isPrimeNumber(15));
    }
}
