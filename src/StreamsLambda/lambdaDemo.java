package StreamsLambda;

import java.util.ArrayList;
import java.util.List;

public class lambdaDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Paul");
        names.add("John");
        names.add("Peter");
        names.add("David");

  /*      names = modify(names, n -> n.contains("m"));
        names.forEach(n -> System.out.println(n));

        names = modify(names, new Filter() {
            @Override
            public boolean filter(String input) {
                return input.startsWith("a");
            }
        });
        names.forEach(n -> System.out.println(n));

        names = modify(names, n -> n.contains("a"));
        names.forEach(n -> System.out.println(n)); */


        List<String> modifiedNames = new ArrayList<>();
        for (String name : names) {
            modifiedNames.add(modifyAndDisplay(name,n-> n + "!"));
        }

        modifiedNames.forEach(n -> System.out.println(n));
    }

    static ArrayList<String> modify(List<String> list, Filter filter){
        ArrayList<String> results = new ArrayList<>();
        for (String name : list){
            if(filter.filter(name)){
                results.add(name);
            }
        }
        return results;
    }

    static String modifyAndDisplay(String string, Modifier modifier){
        return modifier.modify(string);
    }

}
