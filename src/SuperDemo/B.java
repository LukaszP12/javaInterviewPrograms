package SuperDemo;

public class B extends A {

    public B() {
        super(6);
        System.out.println("in B");
    }

    public B(int i) {
        super(i);
        System.out.println("in B int");
    }

}
