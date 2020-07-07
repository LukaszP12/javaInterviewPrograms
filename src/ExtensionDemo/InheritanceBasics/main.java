package ExtensionDemo.InheritanceBasics;

public class main {

    public static void main(String[] args) {
        Person person = new Student("Lukasz",1993,"Computer Science");
        System.out.println(person);

        System.out.println(person instanceof Student);

//        Instructor instructor = (Instructor) new Person("Pawel",1995);
//        System.out.println(instructor);

        Person instructor = new Instructor("Peter", 1995, 2500);
        System.out.println(instructor);

        instructor.hello();

        ((Person)instructor).hello(); // casting back to Person does not revoke the override

        Person instructorBackToPerson = instructor;
        System.out.println(instructorBackToPerson.toString()); // casting back to Person does not revoke the override

    }

}
