import java.util.*;
import java.util.stream.Collectors;

public class SortListDemo {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        Collections.sort(list);
        Collections.reverse(list);
        list.forEach(System.out::println);

        list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));

         List<Integer> list1 = list.stream()
                .sorted()
                .filter(x -> x %2 != 0)
                .map(x -> x*x)
                .collect(Collectors.toList());

         list1.forEach(System.out::println);


        List<Employee> listEmployees = new ArrayList<>();

        Employee emp1 = new Employee(1,"Luke","Sales",2000);
        Employee emp2 = new Employee(2,"Paul","Acccounting",3000);
        Employee emp3 = new Employee(3,"Peter","Manager",4000);
        Employee emp4 = new Employee(4, "Mathew", "Engineer", 5000);
        Employee emp5 = new Employee(5, "Boris", "Clerk", 4000);

        listEmployees.add(emp1);
        listEmployees.add(emp2);
        listEmployees.add(emp3);
        listEmployees.add(emp4);
        listEmployees.add(emp5);

        Collections.sort(listEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        Collections.sort(listEmployees, (o1,o2) -> (int) (o1.getSalary() - o2.getSalary()));

        listEmployees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(x -> x.toString());

        listEmployees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(x -> System.out.println(x)) ;


    }
}