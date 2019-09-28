// Using copyOf() method
/*
    Object[] gfg = a1.toArray();
    String[] str = Arrays.copyOf(gfg, gfg.length, String[].class);

    1. Get the ArrayList of String
    2. Convert ArrayList to Object array using toArray() method.
    3. Convert it to String Array using Arrays.copyOf() method.
    4. Print String Array

 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayOfStringToStringArray3 {

    // function to convert ArrayList<String> to String[]
    public static String[] GetStringArray(ArrayList<String> arr)
    {
        // Convert ArrayList to object array
        Object[] objArr = arr.toArray();

        // Convert Object array to String array
        String[] str = Arrays.copyOf(objArr,objArr.length,String[].class);

        return str;
    }

    public static void main(String[] args) {
        //declaration and initialise ArrayList
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Geeks");
        a1.add("for");
        a1.add("Geeks");

        // print ArrayList
        System.out.println("ArrayList: " + a1);

        // Get String Array
        String[] str = GetStringArray(a1);

        // Print Array Elements
        System.out.println("String Array[]: " + Arrays.toString(str));

    }

}
