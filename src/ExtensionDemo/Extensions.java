package ExtensionDemo;

//This form of inheritance is called HIDING, not OVERRIDINGW

public class Extensions {

    public static class A {
        public int i = 0;
        public int j = -1;
    }

    public static class B extends A {
        public int i = 1;
    }

    public static void main(String[] args) {
        B x = new B();
        System.out.println("I found j in the parent class: " + x.j);
        System.out.println("Element i appearing in both: " + x.i);
        System.out.println("Element i from the parent class: " + ((A)x).i) ;
    }

}
