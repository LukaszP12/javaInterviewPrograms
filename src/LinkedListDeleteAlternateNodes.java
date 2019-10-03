public class LinkedListDeleteAlternateNodes {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d){data = d; next = null;}
    }

    void deleteAlt()
    {
        if (head == null)
            return;

        Node prev = head;
        Node now = prev.next;

        while (prev != null && now != null){
            // change next link of the previous node
            prev.next = now.next;

            // free node
            now = null;

            //update prev and now
            prev = prev.next;
            if(prev != null)
                now = prev.next;
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    // Function to print linked list
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListDeleteAlternateNodes linkedListDeleteAlternateNodes =  new LinkedListDeleteAlternateNodes();

        linkedListDeleteAlternateNodes.push(5);
        linkedListDeleteAlternateNodes.push(4);
        linkedListDeleteAlternateNodes.push(3);
        linkedListDeleteAlternateNodes.push(2);
        linkedListDeleteAlternateNodes.push(1);

        System.out.println("Linked List before calling deleteAlt() ");
        linkedListDeleteAlternateNodes.printList();

        linkedListDeleteAlternateNodes.deleteAlt();

        System.out.println("Linked List after calling deleteAlt() ");
        linkedListDeleteAlternateNodes.printList();
    }
}
