package StreamsLambda.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class example11 {

    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d","a"}, {"e", "f"}};

        List<String> result = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());

        System.out.println(result);

        Stream.of("Lukasz","Pawel","Piotr")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        String[] names = {"Adam","Patryk","Pawel","Piotr","Rafal"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("P"))
                .findFirst()
                .ifPresent(x -> System.out.println(x));


        int[] numbers = {22, 44, 55, 66, 77, 88, 90, 102};
        Arrays.stream(numbers)
                .map(x -> x*x)
                .filter(x -> x%2 == 0)
                .average()
                .ifPresent(System.out::println);




    }

}
