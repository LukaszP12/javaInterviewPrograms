package InheritanceDemo;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Burek", 5);
        System.out.println(dog);

        dog.makeSound();
        dog.info();

        Animal burek = new Dog("Burek", 3);
        burek.makeSound();
//        burek.info();

        ((Dog) burek).info();
        Dog pies = (Dog) burek;
        pies.info();

        ((Animal)burek).makeSound(5);

        System.out.println("makeSound demo");
        Animal.makeSound(5);
        Dog.makeSound(5);

        System.out.println("casting example");
        Animal animal = new Animal("Dog", 7);
//        Dog puppy = (Dog) animal;
//        System.out.println(puppy);
//        puppy.info();

        Dog dog1 = new Dog("Burek", 3, "Jan");
        ((Animal)dog1).makeSound();

    }


}
