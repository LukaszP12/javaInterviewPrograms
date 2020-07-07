package ExtensionDemo;

public class Extensions1 {

    static class A {
        int i;
        int j;

        public A() {
            this.i = 0;
            this.j = -1;
        }
    }

    static class B extends A {
        public B() {
            super();
            this.i = 1;
        }
    }

    public static void main(String[] args) {
        B x = new B();
        System.out.println("Example 1: " + x.j); // cannot find j in B, so we go to the parent class
        System.out.println("Example 2: " + x.i); //
        System.out.println("Example 3: " + ((A) x).i); // we return 1 because we set it in B constructor

    }

}
