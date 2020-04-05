public class reverseStringRecursion {

    public static String reverseString(String word){

        if (word.isEmpty())
            return word;

        return reverseString(word.substring(1)) + word.charAt(0);
    }


    public static void main(String[] args) {
        String str = "I am reversing a sentence";
        String reversedSentence = reverseString(str);
        System.out.println("The reversed sentence is: " + reversedSentence);
    }

}
