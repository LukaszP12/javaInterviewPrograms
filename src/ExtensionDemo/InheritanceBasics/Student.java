package ExtensionDemo.InheritanceBasics;

public class Student extends Person {

    private String major;

    public Student(String name, int birthYear, String major) {
        super(name, birthYear);
        this.major = major;
    }

    @Override
    public void hello() {
        System.out.println("Hello, I am a student");
    }

    @Override
    public String toString() {
        return "Student[super=" + super.toString() + ",major=" + major + "]";
    }

}
