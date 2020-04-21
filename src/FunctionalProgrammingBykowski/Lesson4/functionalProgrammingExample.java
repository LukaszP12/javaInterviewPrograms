package FunctionalProgrammingBykowski.Lesson4;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class functionalProgrammingExample {

    @Test
    public void functionalProgrammingExample() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.stream()
            .filter(x -> x.length() > 5)
            .count();

        System.out.println("Imiona po filtrowaniu");
        names.forEach(System.out::println);

        long count = 0;
        for (String name : names){
            if (name.length() > 6){
                count++;
            }
        }
        System.out.println(count + " słów jest większych niż 6 znaków ");
    }

}
