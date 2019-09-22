package Main;

public class wordReverse {

    public static String wordReverse(String word){

        int len = word.length();

        String newWord = new StringBuilder(word).reverse().toString();

        return newWord;
    }

    public static String stringReverseRecur(String word){
        if(word.isEmpty()){
            System.out.println("The string is empty");
            return word;
        }
        //Calling Function Recursively
        System.out.println("String to be passed in Recursive function: " + word.substring(1));
        return stringReverseRecur(word.substring(1)) + word.charAt(0);
    }

    public static void main(String[] args) {
        String Lukas = "Lukasz";
        String Pawel = "Pawel";
        String sentence = "This is a java tutorial";

        System.out.println(wordReverse(Lukas) + " " +  wordReverse(Pawel) + " " +  wordReverse(sentence));

        String sentenceToReverse = "This sentence should be reversed";
        System.out.println(stringReverseRecur(sentenceToReverse));

    }


}
