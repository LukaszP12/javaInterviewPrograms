package Main;

public class charArrayDemo {

    private static String demo = "This a demo of a char array";

    public static void main(String[] args) {
        System.out.println("This is a demo of a char array");

        char ch[] = demo.toCharArray();

        for (char c : ch){
            System.out.println(c + " ");
        }
        System.out.println("And now upside down");

        for (int i=ch.length - 1; i>0; i--){
            System.out.println(ch[i] + " ");
        }

        //printing the array in reverse order
        reverse(ch);

        //also printing in the reverse order
        System.out.println(ch);

        for(char c : ch){System.out.println(c + " ");}

    }

    // reverse an array
    public static void reverse(char a[]){
        int len = a.length;

        if (len == 0) return;

        for (int i=0; i < len/2; i++){
            char l = a[i];
            a[i] = a[len-i-1];
            a[len-i-1] = l;
            }
        }

    }