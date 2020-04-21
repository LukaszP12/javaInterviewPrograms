package FunctionalProgrammingBykowski.Lesson1;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

    @Test
    public void function() {
        Function<Integer, String> function = x -> x + x + "bykowski.pl";
        System.out.println(function.apply(69));

        Function<Integer,Integer> function1 = x -> x*x/x;
        System.out.println(function1.apply(12));
        System.out.println(function1.apply(14));
        System.out.println(function1.apply(16));

        Function<Integer,String> function2 = x -> x + " The Middle Part " + x;
        System.out.println(function2.apply(2));

        Function<String,Integer> parsing = x -> Integer.valueOf(x);
        System.out.println(parsing.apply("12345"));

    }

    @Test
    public void predicate() {
        Predicate<Student> predicate = p -> p.getAge() > 21;

        boolean test = predicate.test(new Student("Przemek", "Bykowski", 34));
        boolean test1 = predicate.test(new Student("Karolina", "Nowak", 20));

        System.out.println("The result of the first test: " + test + " the result of the second test: " + test1);

        System.out.println("Does the student's surname begin with B ? ");

        Predicate<Student> doesSurnameBeginWithB = p -> p.getSurname().startsWith("B");

        boolean test2 = doesSurnameBeginWithB.test(new Student("Przemek", "Bykowski", 30));
        System.out.println("Yes, the surname does begin with B");

        Predicate<Student> predicate1 = p -> p.getFirstname().length() > 5;
        boolean test3 = predicate1.test(new Student("Lukasz", "Piwowarski", 27));
        System.out.println("Does the first name have more characters than 5 " + test3);
    }

    @Test
    public void functionalThread() throws Exception {

        Thread t1 = new Thread(() -> System.out.println("Hello World !") );
        t1.start();

        Thread t2 = new Thread( () -> System.out.println("I am testing the printing function.") );
        t2.start();

        Thread t3 = new Thread( () -> System.out.println("This is the 3rd thread. "));
        t3.start();
    }

}
