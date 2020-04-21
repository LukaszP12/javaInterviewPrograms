package StreamsLambda;

import java.util.stream.IntStream;

public class StreamTutorial {

    public static void main(String[] args) {
        IntStream.iterate(0, i -> i < 5, i -> i + 1)
                .parallel()
                .forEach(i -> System.out.println(i));
    }
}
