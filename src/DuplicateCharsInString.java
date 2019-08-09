//Write a program to find out duplicate or repeated characters in a
//string, and calculate the count of repeatation.

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

    public void findDuplicateChars(String str){

        Map<Character,Integer> dupMap = new HashMap<Character, Integer>();
        char[] chrs = str.toCharArray();
        for(Character c : chrs){
            if(dupMap.containsKey(c)){
                dupMap.put(c,dupMap.get(c)+1);
            }else {
                dupMap.put(c,1);
            }
        }

        Set<Character> keys = dupMap.keySet();
        for (Character character : keys){
            if(dupMap.get(character) > 1 ){
                System.out.println( character + " repeats itself");
            }
        }
    }

    public static void main(String[] args) {
        DuplicateCharsInString duplicateCharsInString = new DuplicateCharsInString();
        duplicateCharsInString.findDuplicateChars("Java2Notice");
    }

}
