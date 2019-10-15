import java.util.ArrayList;
import java.util.ListIterator;

public class listIteratorDemo {

    public static void test1(){
        try {
            ArrayList<String> arrayList = new ArrayList<String>();

            arrayList.add("A");
            arrayList.add("B");
            arrayList.add("C");
            arrayList.add("D");

            System.out.println("ArrayList: " + arrayList);

            ListIterator<String> iterator = arrayList.listIterator();

            //printing
            System.out.println("Printing using String Iterator");
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
        catch (NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }
    }



    public static void main(String[] args) {
        test1();
    }

}
