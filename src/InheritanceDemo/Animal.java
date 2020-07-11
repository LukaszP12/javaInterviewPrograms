package InheritanceDemo;

public class Animal {

    private String name;
    private int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal is making sound");
    }

    public static void makeSound(int volume) {
        System.out.println("Animal is making sound of: " + volume);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
