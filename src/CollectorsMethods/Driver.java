package CollectorsMethods;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Obtain Poland based and non-Poland based people using partioningBy and groupingBy");
        List<Person> personList = populateWithData();
        System.out.println(personList.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("Poland"))));
        System.out.println(personList.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry().equals("Poland"))));

        System.out.println("People from Germany");
        System.out.println(personList.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("Germany"))));

        System.out.println("People from Russia");
        System.out.println(personList.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("Russia"))));

        System.out.println("count Poland based and non-Poland based people using partioningBy and groupingBy");
        System.out.println(personList.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("Poland"),
                Collectors.counting() )));
        System.out.println(personList.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry().equals("Poland"),
                Collectors.counting() )));

        System.out.println("count Germany based and non-Germany based people using partioningBy and groupingBy");
        System.out.println(personList.stream().collect(Collectors.partitioningBy((Person p ) -> p.getCountry().equals("Germany"),
                Collectors.counting()   )));

        System.out.println("count Russia based and non-Russian based people using partioningBy and groupingBy");
        System.out.println(personList.stream().collect(Collectors.partitioningBy((Person p ) -> p.getCountry().equals("Russia"),
                Collectors.counting() )));

        System.out.println("obtain the people in each country  and count them  using groupingBy");
        System.out.println(personList.stream().collect(Collectors.groupingBy((Person p ) -> p.getCountry())));
        System.out.println(personList.stream().collect(Collectors.groupingBy((Person p ) -> p.getCountry(),Collectors.counting() )));

        System.out.println("obtain Polish and non-Polish based people using partioningBy\n" +
                "& map names to uppercase using mapping");
        System.out.println(personList.stream().collect(Collectors.partitioningBy( (Person p ) -> p.getCountry().equals("Poland"),Collectors.mapping(p -> p.getName().toUpperCase(), Collectors.toList() ) )));

        System.out.println("obtain the people in each country using groupingBy & map names\n" +
                "to uppercase using mapping");
        System.out.println(personList.stream().collect(Collectors.groupingBy( (Person p ) -> p.getCountry().equals("Poland"),Collectors.mapping(p -> p.getName().toUpperCase(), Collectors.toList() ) )));

    }

    static List<Person> populateWithData(){
        Person person = new Person("Lukas", "Poland");
        Person person1 = new Person("Pawel","Poland");
        Person person2 = new Person("Jurij","Russia");
        Person person3 = new Person("Paul","Germany");
        Person person4 = new Person("Peter","Germany");
        Person person5 = new Person("Piotr","Poland");
        Person person6 = new Person("Yegor","Russia");
        Person person7 = new Person("Alexander","Russia");

        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        return personList;
    }

}
