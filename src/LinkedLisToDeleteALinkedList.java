import java.security.spec.RSAOtherPrimeInfo;

public class LinkedLisToDeleteALinkedList {

    Node head; // head of the list

    /* Linked List node */
    class Node
    {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    /* Function deletes the entire linked list */
    void deleteList()
    {
        head = null;
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }


    public static void main(String[] args) {
        LinkedLisToDeleteALinkedList linkedLisToDeleteALinkedList = new LinkedLisToDeleteALinkedList();

        linkedLisToDeleteALinkedList.push(1);
        linkedLisToDeleteALinkedList.push(4);
        linkedLisToDeleteALinkedList.push(1);
        linkedLisToDeleteALinkedList.push(12);
        linkedLisToDeleteALinkedList.push(1);

        System.out.println("Deleting the list");
        linkedLisToDeleteALinkedList.deleteList();

        System.out.println("Linked list deleted");

    }

}
