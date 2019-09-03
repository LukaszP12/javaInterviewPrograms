package Main;

// Java implementation to find the sum of
// nodes of the Linked List

public class GFG {
    static int sum = 0;

    // A linked list node
    static class Node { int data; Node next; }

    // function to insert a node a the beginning
    // of the linked list
    static Node push(Node head_ref, int new_data){
        //allocate node
        Node newNode = new Node();
        //put in the data
        newNode.data = new_data;
        //link the old list to the new node
        newNode.next = head_ref;
        // move the head to point to the new node
        head_ref = newNode;
        return head_ref;
    }

   // function to recursively find the sum of
    // nodes of the given linked list
    static void sumOfNodes(Node head)
    {
        // if head = null
        if(head == null)
            return;

        // recursively traverse the remaining nodes
        sumOfNodes(head.next);

        // accumulate the sum
        sum = sum + head.data;
    }

}
