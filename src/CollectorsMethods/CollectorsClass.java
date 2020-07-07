package CollectorsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsClass {

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> names = Arrays.asList("Adam", "Brent", "Andrew", "Carl", "Doug", "Alex");

        String concat = "";
        for (String l : letters){
            concat += l;
        }
        System.out.println(concat);

        String concat2 = letters.stream().collect(Collectors.joining());
        System.out.println(concat2);

        String collected = names.stream().collect(Collectors.joining(","));
        System.out.println(collected); // glued names

        String collected2 = names.stream().collect(Collectors.joining("|"));
        System.out.println(collected2); // glued names

        ArrayList<String> namesWithA = new ArrayList<String>();
        for (String n : names){
            if (n.startsWith("A")){
                namesWithA.add(n);
            }
        }
        System.out.println(namesWithA);

        List<String> namesWithA2 = names.stream()
                .filter(x -> x.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(namesWithA2);
    }

}
