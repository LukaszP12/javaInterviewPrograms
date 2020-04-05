import java.util.*;
import java.util.Map.Entry;

public class SortMapDemo {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        map.forEach((name, integer) -> System.out.println(integer + " " + name));

        List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        for(Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        Map<Employee,Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        employeeMap.put(new Employee(176,"Roshan","IT",60000), 60);
        employeeMap.put(new Employee(388,"Bikash","CIVIL",90000),90);
        employeeMap.put(new Employee(470,"Bimal","DEFENSE",50000),50);
        employeeMap.put(new Employee(624,"Sourav","CORE",400000),40);
        employeeMap.put(new Employee(284,"Prakash","SOCIAL",120000),120);

        List<Entry<String, Integer>> entries1 = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(o1,o2) -> o1.getKey().compareTo(o2.getKey()));


        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);

    }
}