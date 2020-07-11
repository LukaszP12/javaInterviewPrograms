package InheritanceDemo;


public class Dog extends Animal {

    private String owner;

    public Dog(String name, int age){
        super(name,age);
    }

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public void info(){
//        super.name = "Burek";
        super.setName("Burek");
        System.out.println("Info about dog");
    }

    @Override
    public void makeSound(){
        System.out.println("Dog is barking");
    }

    public static void makeSound(int volume) {
        System.out.println("Dog is making sound of: " + volume);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "owner='" + owner + '\'' +
                "} " + super.toString();
    }

}
