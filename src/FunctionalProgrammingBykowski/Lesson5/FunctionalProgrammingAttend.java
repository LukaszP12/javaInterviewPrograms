package FunctionalProgrammingBykowski.Lesson5;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionalProgrammingAttend {

    @Test
    public void lambdaExample(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final Integer[] integer = {2};

        List<Integer> collectNumber = numbers.stream()
                .map(x -> x * integer[0])
                .limit(5)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("-------");
        System.out.println(collectNumber);
    }

    @Test
    public void limitAndSort(){
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");

        String collect = names.stream()
                .filter(x -> x.length() > 5)
                .limit(3)
                .map(String::toUpperCase)
                //.sorted((o1,o2) -> o1.length() - o2.length()) // jeżeli ciąg tekstowy o1 jest dłuższy to będzie pierwszy w kolejności
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining("."));

        System.out.println(collect);
    }

    @Test
    public void statistics(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalInt optionalInt = numbers.stream()
                .mapToInt(x -> x)
                .max();

        System.out.println(optionalInt.getAsInt());

        IntSummaryStatistics intSummaryStatistics = numbers.stream()
                .mapToInt(x -> x)
                .summaryStatistics();

        System.out.println(intSummaryStatistics);

    }


}
