import java.util.ArrayList;
import java.util.Arrays;

public class arrayOfStringToStringArray1 {

    // 1. Get the ArrayList of String
    // 2. Find the size of ArrayList using size() method, and create a String Array of this size
    // 3. Fetch each element of the ArrayList one by one using get() method
    // 4. Assigned each element into String Array using assigment(=) operator.
    // 5. Print String Array

    // Function to convert ArrayList<String> to String[]
    public static String[] getStringArray(ArrayList<String> arr){
        // declaration and initialise String Array
        String str[] = new String[arr.size()];

        // ArrayList to Array Conversion
        for(int i = 0; i<arr.size(); i++){
            str[i] = arr.get(i);
        }

        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Geeks");
        a1.add("for");
        a1.add("Geeks");

        System.out.println("Array List: " + a1);

        // Get String Array
        String[] string = getStringArray(a1);

        //Arrays.toString represents a string representation of the contents of the specified int array
        System.out.println("The converted Array of String is: " + Arrays.toString(string));

    }

}
