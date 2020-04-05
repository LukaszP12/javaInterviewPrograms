import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class forEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Murrit");
        list.add("John");
        list.add("Peter");
        list.add("Marek");

        for (String s : list){
            System.out.println(s);
        }

        list.stream().forEach(System.out::println);
        list.stream().forEach(x -> System.out.println(x));

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        map.forEach((key,value)-> System.out.println(key + ": " +value) );
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

        Consumer<String> consumer = (t) -> System.out.println(t);
        consumer.accept("javatechie");

        // filter--> conditional check
        for(String s:list){
            if(s.startsWith("P")) {
                System.out.println(s);
            }
        }

    }

}
