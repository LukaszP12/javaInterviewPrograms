package ExtensionDemo;

public class StaticMethodInheritance {

    public static class A {
        public static String f(){
            return "Called A's static f";
        }
        public static String g(){
            return "Called A's static g";
        }
    }

     static class B extends A {
        public static String f(){
            return "Called B's static f";
        }
    }

    static class Main {
        public static void main(String[] args) {
            B x = new B();
            System.out.println("Example 1: " + x.g()); // Can't find g in B, so look in B's parent
            System.out.println("Exaple 2: " + x.f());
            System.out.println("Example 3: " + ((A) x).f());
        }
        /* This form of inheritance is called HIDING, not OVERRIDING.
           Because we use the static type to lookup a static method, it causes B.f to not eliminate A.f; instead, it
               "hides" it based off of the static type.
           Unlike instance method inheritance where it is impossible to call a parent's overridden instance method from
              an instance of the child, hiding picks based off of the static type and thus, by casting it, we can find it.
        */
    }

}
