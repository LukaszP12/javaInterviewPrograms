package ExtensionDemo;

public class Shoe {

    protected final String brand;
    protected final double size;

    public Shoe(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "I am wearing " + this.brand + " of size " + this.size;
    }

}
