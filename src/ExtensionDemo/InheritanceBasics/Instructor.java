package ExtensionDemo.InheritanceBasics;

public class Instructor extends Person {

    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    @Override
    public void hello() {
        System.out.println("Hello, I am an instructor");
    }

    @Override
    public String toString() {
        return "Person[super=" + super.toString() + ",salary=" + salary + "]";
    }

}
