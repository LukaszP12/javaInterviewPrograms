package StreamsLambda;

// Streams can be created from Collections, Lists, Sets, ints, longs, doubles, arrays, lines of file
// Zero or more intermediate operations are allowed.
// Orders maters for large datasets: filter first, then sort or map.
// For very large datasets use ParallelStream to enable multiple threads.

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) throws IOException {
        // 2. Integer Stream
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        // 3. Integer Stream with sum
        System.out.println(
        IntStream
            .range(1,5)
            .sum());
        System.out.println();

        // 4. Stream.of, sorted and findFirst
        Stream.of("Ava","Aneri","Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // 5. Stream from Array, sort, filter and print
        String[] names = {"Al","Ankit","Kushal","Brent","Sarika","amanda","Hans","Shivika"};
        Arrays.stream(names) // same as Stream.of(names)
            .filter(x -> x.startsWith("S"))
            .sorted()
            .forEach(System.out::println);

        // 6. average of squares of an int array
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        Arrays.stream(new int[] {1,3,6,9,14,17})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Al","Ankit","Brent","Sarika","amanda","Hans","Shivika");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        // 8.

    }


}