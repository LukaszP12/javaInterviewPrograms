package CloneableDemo;

public class Main {

    public static void main(String[] args) {
        Student joe = new Student("Joe");
        Student dup = joe;

        System.out.println(joe == dup);
        try {
            dup = (Student)joe.clone();
            System.out.println(joe == dup);
        } catch (CloneNotSupportedException e){
            System.out.println("The object cannot be cloned");
        }


        System.out.println("Now the second cloneable part: ");

        Person lukas = new Person("Lukas",20);
        Person lukasDup = lukas;

        System.out.println(lukas == lukasDup);

        try {
            lukasDup = (Person)lukas.clone();
            System.out.println(lukas == lukasDup);
        } catch (CloneNotSupportedException e){
            System.out.println("The object cannot be cloned");
        }

    }

}
