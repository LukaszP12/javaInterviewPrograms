package Main;

import org.w3c.dom.Node;

public class LinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //Reversing the linked list
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    //printing the linked list
    void printList(Node node){
        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    //function to print middle element
    void printMiddle(){
        Node slowPointer = head;
        Node fastPointer = head;
        if(head != null){
            while (fastPointer != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
            System.out.println("The middle element is : " + slowPointer.data);
        }
    }
    //insert a new Node a front of the list
    public void push(int new_data){
        // allocate the Node & put in the data
        Node new_node = new Node(new_data);
        // make next of new node - head
        new_node.next = head;
        // make head point to the new node
        head = new_node;
    }

    //printing list
    public void printList(){
        Node tnode = head;
        while (tnode != null){
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    //method to count the nodes
    public int getCount(Node start)
    {
        Node temp = start;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    //Function to get the kth node from the mid
    //towards begin of the linked list
    public int printKthfromid(Node start, int k){
        //total number of nodes in the linked list
        int n = getCount(start);
        int reqNode = ((n + 1) / 2) - k;

        //if no such node exist, return - 1
        if(reqNode <= 0)
            return -1;
        else
        {
            Node current = start;
            int count = 1, ans = 0;

            while (current != null){
                if(count == reqNode){
                    ans = current.data;
                }

                count++;
                current = current.next;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list");
        list.printList(head);

        list.printMiddle();

        System.out.println("The count of the list is " + list.getCount(head));

    }

}