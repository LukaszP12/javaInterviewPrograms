import java.util.Arrays;
import java.util.List;

public class reverseFunction2 {

    static Node head;

    static class Node
    {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            next = null;
        }
    }

    public void reversing(Node head){
        if(head==null){return;}

        reversing(head.next);

        System.out.println("Teraz funkcja wraca");

        System.out.println(
                head.data + " "
        );
    }


    public static void main(String[] args) {
            reverseFunction2 reverseFunction2 = new reverseFunction2();
            reverseFunction2.head = new Node("do tyłu");
            reverseFunction2.head.next = new Node("wraca");
            reverseFunction2.head.next.next = new Node("funkcja");
            reverseFunction2.head.next.next.next = new Node("Teraz");

            reverseFunction2.reversing(head);

    }

}
