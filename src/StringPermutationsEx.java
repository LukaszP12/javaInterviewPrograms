// Print all permutations of a given string. For example, xy would be xy and yx.

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsEx {

    public static void main(String[] args) {

        List<String> output = StringPermutationsEx.generatePermutations("xyz");
        System.out.println("Result size: "+output.size());
        output.stream().forEach(System.out::println);
        System.out.println("------------------");

        output = StringPermutationsEx.generatePermutations("ABCD");
        System.out.println("Result size: "+output.size());
        output.stream().forEach(System.out::println);
    }


    public static List<String> generatePermutations(String input){

        List<String> strList = new ArrayList<String>();
        StringPermutationsEx.permutations("",input,strList);

        return strList;
    }

    private static void permutations(String consChars, String input, List<String> opContainer){

        if(input.isEmpty()){
            opContainer.add(consChars + input);
            return;
        }

        for (int i=0; i<input.length(); i++){
            permutations(consChars+input.charAt(i),
                                    input.substring(0,i) + input.substring(i+1),
                                    opContainer);
        }
    }
}