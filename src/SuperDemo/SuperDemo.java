package SuperDemo;

public class SuperDemo {

    public static void main(String[] args) {
//          A obj = new A(); \
//          B b = new B(); // it is calling both constructors, of both the subclass and parentclass
//        A a = new B();

        B b1 = new B();

        B b = new B(5); // this will call the int parameter in child class and default parameter in parent class
                            // we have to use the super() and put int inside the bracket to call the parameter constructor

    }

}
