package FunctionalProgrammingBykowski.Lesson3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalProgrammingReferenceMethod {

    @Test
    public void ConsumerFall() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }

            Consumer<String> consumerImpl = (s -> System.out.println(s));
        });
    }

    @Test
    public void ConsumerShorter() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach((name) -> System.out.println(name));
    }

    @Test
    public void ConsumerSuperShorter(){
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach(x -> System.out.println(x));
    }

    @Test
    public void ConsumerShortReference(){
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach(System.out::println);
    }

}
