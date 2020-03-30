import java.util.LinkedList;

public class findMiddleElement {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // function to print the middle of linked list
    void printMiddle()
    {
        Node slow_ptr = head;
        Node fast_ptr = head;

        if(head != null)
        {
            while (fast_ptr != null && fast_ptr.next != null){
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" + slow_ptr.data + "] \n");
        }
    }

    void printMiddle(Node head)
    {
        int count = 0;
        Node mid = head;

        while (head != null)
        {
            if (count%2 != 0){
                mid = mid.next;
            }
            count++;
            head = head.next;
        }
        System.out.println("The middle element is: " + mid.data);
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        findMiddleElement list = new findMiddleElement();
        for (int i=0; i<20;i++){
            list.push(i);
        }
        list.printMiddle();
    }


}
