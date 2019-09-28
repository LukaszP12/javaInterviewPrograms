/*
    Object[] arr = a1.toArray()
    String str = (String)obj;

    1. Get the ArrayList of String
    2. Convert ArrayList to Object using toArray() method
    3. Iterate and convert each element to desired type using
      typecasting. Here it is converted to String type and added
      to the String array.
    4. Print String Array.
*/

import javax.crypto.AEADBadTagException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayOfStringToStringArray2 {
    // Function to convert ArrayList<String> to String[]
    public static String[] GetStringArray(ArrayList<String> arr){

        String str[] = new String[arr.size()];

        // Convert ArrayList to object array
        Object objArr[] = arr.toArray();

        // Iterating and converting to String
        int i = 0;
        for (Object obj : objArr ){
            str[i++] = (String) obj;
        }

        return str;
    }

    public static void main(String[] args) {
        // declaration and initialise ArrayList
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Geeks");
        a1.add("for");
        a1.add("Geeks");

        //print ArrayList
        System.out.println("ArrayList: " + a1);

        //Get String Array
        String[] str = GetStringArray(a1);

        // Print Array Elements
        System.out.println("String Array[]: " +
                 Arrays.toString(str));

    }

}
