package CollectorsMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static CollectorsMethods.Driver.populateWithData;

public class CollectorsDemo {

    public static void main(String[] args) {
        List<Person> personList = populateWithData();
        // Accumulate names into a List
        List<String> list = personList.stream().map(Person::getName).collect(Collectors.toList());

        // Accumulate names into a TreeSet
        Set<String> set = personList.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));

        // Convert elements to strings and concatenate them, separated by commas
        String joined = list.stream().map(Objects::toString).collect(Collectors.joining(", "));
        System.out.println(joined);

        List<Employee> employees = Arrays.asList(
                new Employee("John", "US", 2000, "accounting"),
                new Employee("David", "US", 2500, "finance"),
                new Employee("Paul", "Germany", 3000, "IT"),
                new Employee("Stuart", "US", 2200, "accounting"),
                new Employee("Madison", "US", 2400, "IT"),
                new Employee("Thomas", "Germany", 2600, "finance")
        );

        // Compute sum of salaries of employee
        double total = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));

        // Group employees by department
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(collect.entrySet());

        // Compute sum of salaries by department
         Map<String, Double> totalByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
                 Collectors.summingDouble(Employee::getSalary)));
        System.out.println(totalByDept.entrySet());

        // Partition students into passing and failing
        List<Student> students = Arrays.asList(
                new Student("Mark", "US", 3),
                new Student("Johnny", "US", 4),
                new Student("Sam", "England", 4),
                new Student("Katherine", "Germany", 5),
                new Student("Paul", "Germany", 2),
                new Student("Fernando", "Spain", 4),
                new Student("Aleksei", "Russia", 5)
        );

        Map<Boolean, List<Student>> passingFailing = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getMark() >= 3));
        System.out.println(passingFailing.entrySet());
    }

}
