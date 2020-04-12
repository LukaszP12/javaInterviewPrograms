package StreamsLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class streamsDemo {

    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();

        list.add("Janusz");
        list.add("Wojciech");
        list.add("Pawel");
        list.add("Piotr");
        list.add("Maciej");

        Comparator<User> comparator = Comparator.comparing(User::getAge);

        List<User> userList = list.stream()
                .filter(user -> user.endsWith("a"))
                .map(s -> new User(s, new Random().nextInt(70)))
                .sorted(comparator.reversed())
                .collect(Collectors.toList());

    }

    private static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            System.out.println("Tworzę usera");
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}
