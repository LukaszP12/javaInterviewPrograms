package StreamsLambda.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntStream {

    public static void main(String[] args) {
        int numbers[] = {4,1,13,90,16,2,0};

        System.out.println(java.util.stream.IntStream.of(numbers).min());
        System.out.println(java.util.stream.IntStream.of(numbers).max());
        System.out.println(java.util.stream.IntStream.of(numbers).average());
        System.out.println(java.util.stream.IntStream.of(numbers).count());
        System.out.println(java.util.stream.IntStream.of(numbers).sum());

        //clone
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        //sort
        Arrays.sort(copy);
        // pick first 3
        Arrays.stream(copy).distinct().sorted().limit(3).forEach(System.out::println);

        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        int sum = java.util.stream.IntStream.of(numbers1).sorted().limit(3).sum();
        System.out.println("The sum of the array is " + sum);

        int[] numbers2 = {2,4,6,8,10,12,14,16,18};
        Stream<Integer> boxed = java.util.stream.IntStream.of(numbers2).distinct().sorted().limit(3).skip(3).filter(num -> num % 2 == 0).map(num -> num * 2).boxed();// boxed() convert each number to int
        System.out.println(Arrays.toString(boxed.toArray()));

        java.util.stream.IntStream.range(1,100).forEach(System.out::println);
        int[] ints = java.util.stream.IntStream.range(1, 100).toArray();
        java.util.stream.IntStream.range(1,100).boxed().collect(Collectors.toList());

        Arrays.stream(ints).forEach(System.out::println);

        if ( java.util.stream.IntStream.of(numbers).anyMatch(n -> n % 2 == 1) && java.util.stream.IntStream.of(numbers).allMatch(n -> n % 2 == 1) ) {
            System.out.println("All numbers are odd");
        } else {
            System.out.println("Any number is odd ");
        }

        List<Employee> employees = Arrays.asList(
                new Employee("Lukas", 20, "accounting"),
                new Employee("David", 25, "managment"),
                new Employee("Danny", 34, "accounting"),
                new Employee("Bob",18, "development"),
                new Employee("Sam",28,"managment" )
        );

        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge)
                        .reversed())
                        .limit(3)
                        .map(Employee::getName)
                        .forEach(System.out::println);

        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).limit(3).map(Employee::getName).forEach(System.out::println);

        // now with cloning the array
        List<Employee> copy1 = new ArrayList<>(employees);
        //sort descending
        copy1.sort(((o1, o2) -> o2.getAge() - o1.getAge()));

       // parallel stream
        Map<String, List<Employee>> empByDept = employees.stream().parallel().collect(Collectors.groupingBy(e -> e.getDept()));
        empByDept.entrySet().stream()
                .forEach(System.out::println);

    }

}
