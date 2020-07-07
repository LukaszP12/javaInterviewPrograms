package ExtensionDemo;

public class InstanceMethods {

    public static class A {
        public String f(){
            return "Called A's f";
        }

        public static String g(){
            return "Called A's f";
        }
    }

    static class B extends A {
        public String f() {
            return "Called B's f";
        }
    }

    static class C extends A {
        public String f() {
            return "From C's f: " + super.f();
        }
    }

    public static void main(String[] args) {
        B x = new B();

        System.out.println("Example 1: " + x.g()); // we find g() in the parent class
        System.out.println("Example 2: " + x.f()); // B's f() overides A's f()
        System.out.println("Example 3: " + ((A) x).f() ); // B's f() completely overrides

        // using super to call parent implementation
        C y = new C();
        System.out.println("Example 4: " + y.f());
    }


}
