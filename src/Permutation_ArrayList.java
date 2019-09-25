import java.util.ArrayList;

public class Permutation_ArrayList {
    // Printing the contents of an array list
    static void printArrayList(ArrayList<String> arrL)
    {
        arrL.remove("");
        for (int i=0; i<arrL.size();i++){
            System.out.println(arrL.get(i) + " ");
        }
    }

    // Function to return the ArrayList, which contains all the permutations of str
    public static ArrayList<String> getPermutations(String string){

        // for an empty list
        if(string.length() == 0){
            ArrayList<String> empty = new ArrayList<String>();
            empty.add("");
            return empty;
        }

        //Take first character of String
        char ch = string.charAt(0);

        // Take sub-string starting from the
        // second character
        String subStr = string.substring(1);

        // Recursive call
        ArrayList<String> prevResult = getPermutations(subStr);

        //Store the generated permutations into
        // the resultant arrayList
        ArrayList<String> Res = new ArrayList<>();

        for (String val : prevResult){
            for(int i=0; i <= val.length();i++){
                Res.add(val.substring(0,i) + ch + val.substring(i));
            }
        }

        return Res;
    }

    public static void main(String[] args) {
        String string = "abc";
        printArrayList(getPermutations(string));
    }

}
