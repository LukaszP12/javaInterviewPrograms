public class PalindromeString {

    public static void main(String[] args) {
        String string1 = "Hello infybuzz";

        String string2 = "abccba";

        System.out.println(string1 + " " + checkPalindrome(string1));

        System.out.println(string2 + " " + checkPalindrome(string2));
    }


    public static String checkPalindrome(String string){
        StringBuilder stringBuilder = new StringBuilder(string);

        String string2 = stringBuilder.reverse().toString(); // String Builder należy jeszcze zamienić na String na toString()
                                                                // stringBuilder.toString()

        if(string.equals(string2))
            return string + "is a palindrom";
        else
            return string + "is not a palindrom";


    }


}