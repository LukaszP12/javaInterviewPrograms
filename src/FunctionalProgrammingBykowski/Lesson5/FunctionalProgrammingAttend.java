package FunctionalProgrammingBykowski.Lesson5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingAttend {

    @Test
    public void lambdaExample(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final Integer integer = 2;

        numbers.stream()
                .map(x -> x*integer)
                .forEach(System.out::println);
    }

}
