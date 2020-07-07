package ExtensionDemo.InheritanceBasics;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void hello(){
        System.out.println("Hello, I am a person");
    }


    @Override
    public String toString() {
        return "Person[name=" + name + ",birthYear=" + birthYear + "] ";
    }



}
