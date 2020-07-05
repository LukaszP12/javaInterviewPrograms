package ExtensionDemo;

public class Main {

    public static void main(String[] args) {
        Shoe shoe = new Shoe("Nike", 42);
        System.out.println(shoe);

        Walking walking = new Walking(true, "Nike", 44);
        System.out.println(walking);
        walking.display();
    }

}
