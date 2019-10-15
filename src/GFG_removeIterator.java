import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GFG_removeIterator {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);

        // Remove elements smaller than 10 using
        // Iterator.remove()
        Iterator iterator = al.iterator();

        while (iterator.hasNext())
        {
            int x = (Integer) iterator.next();
            if(x < 10)
                iterator.remove();
        }
        System.out.println("Modified ArrayList : " + al);
    }

}
