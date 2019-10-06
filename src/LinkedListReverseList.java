import java.util.LinkedList;

public class LinkedListReverseList {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int i) {
            this.data = data;
            this.next = next;
        }

    }

    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null)
        {
            System.out.printf(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        
        LinkedListReverseList linkedListReverseList = new LinkedListReverseList();
        linkedListReverseList.head = new Node(85);
        linkedListReverseList.head.next = new Node(15);
        linkedListReverseList.head.next.next = new Node(4);
        linkedListReverseList.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        linkedListReverseList.printList(head);
        head = linkedListReverseList.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        linkedListReverseList.printList(head);
    }

}
