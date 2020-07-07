package ExtensionDemo;

public class NikeRunner extends Walking {

    private boolean ShoeLaces;

    public NikeRunner(boolean goreTex, String brand, double size, boolean shoeLaces) {
        super(goreTex, brand, size);
        ShoeLaces = shoeLaces;
    }

    @Override
    public void display() {
                System.out.println("Brand: " + this.brand + "size: " + this.size + " of goreTex: " + ((this.goreTex) ? "yes" : "no" ) + " have shoeslaces: " + ((this.ShoeLaces) ? "yes" : "no" ) );
    }

}
