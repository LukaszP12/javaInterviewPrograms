public class reverseAString {

    public static void main(String[] args) {
        System.out.println("I am testing the reverse function");

        reverseString("Lukasz");
    }

    public static void reverseString(String word){
        String newWord = "";

        for (int i=word.length()-1; i>=0 ; i--){
            newWord += word.charAt(i);
        }

        System.out.println(newWord);
    }

}
