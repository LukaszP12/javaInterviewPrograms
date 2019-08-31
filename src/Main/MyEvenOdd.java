package Main;

public class MyEvenOdd {

    public static boolean isEvenNumber(int number){

        if(number%2 == 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Is 16 an even number ? " + isEvenNumber(16));
        System.out.println("Is 23 an even number ?  " +  isEvenNumber(23));
    }

}