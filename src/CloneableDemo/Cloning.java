package CloneableDemo;

public class Cloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        ABC obj = new ABC();
        obj.i=5;
        obj.j=6;

        ABC clone = (ABC)obj.clone();

        System.out.println("Does ABC have the same address as the clone ? " + (clone==obj));
        System.out.println(clone);

        ABC obj1 = new ABC();
        obj1.i = obj.i;
        obj1.j = obj.j;

        obj1.j=8;

        System.out.println(obj);
        System.out.println(obj1);
//        System.out.println(obj1 == obj);

//        System.out.println(obj);
    }

}
