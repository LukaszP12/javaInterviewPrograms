package ExtensionDemo;

public class Walking extends Shoe {

    public final boolean goreTex;



    public Walking(boolean goreTex, String brand, double size) {
        super(brand, size);
        this.goreTex = goreTex;
    }

    public void display(){
        System.out.println("This shoe: " + super.brand + " has a size: " + super.size);
    }

}
