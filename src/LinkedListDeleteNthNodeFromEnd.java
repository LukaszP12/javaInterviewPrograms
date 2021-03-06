public class LinkedListDeleteNthNodeFromEnd {
    // Head of list
    Node head;

    // Linked list Node
    class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to delete the nTh node from
    // the end of the given linked list
    void deleteNode(int key) {
        Node first = head;
        // First pointer will point to the
        // Nth node from the beginning
        Node second = head;
        for (int i = 0; i < key; i++) {

            // If count of nodes in the given
            // linked list is <= N
            if (second.next == null) {

                // If count = N i.e. delete the head node
                if (i == key - 1)
                    head = head.next;
                return;
            }
            second = second.next;
        }

        // Increment both the pointers by one until
        // second pointer reaches the end
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null){
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDeleteNthNodeFromEnd linkedListDeleteNthNodeFromEnd = new LinkedListDeleteNthNodeFromEnd();

        linkedListDeleteNthNodeFromEnd.push(7);
        linkedListDeleteNthNodeFromEnd.push(1);
        linkedListDeleteNthNodeFromEnd.push(3);
        linkedListDeleteNthNodeFromEnd.push(2);

        System.out.println("\nCreated Linked list is:");
        linkedListDeleteNthNodeFromEnd.printList();

        int N = 1;
        linkedListDeleteNthNodeFromEnd.deleteNode(N);

        System.out.println("\nLinked List after Deletion is:");
        linkedListDeleteNthNodeFromEnd.printList();


    }

}