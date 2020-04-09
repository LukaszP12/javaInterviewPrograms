public class recursiveDeleteLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;
    }

    static void deleteLinkedList(Node head){
        if (head == null)
            return;

        deleteLinkedList(head.next);
        System.gc();
    }

    static void push(Node head_ref,int new_data){
        Node new_node = new Node();

        new_node.data = new_data;

        new_node.next = head_ref;

        head_ref = new_node;
    }

    static void display(Node head){
        Node temp = head;

        if (temp == null)
            System.out.println("The list is empty");

        while (temp.next != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        for (int i=0;i<5;i++)
            push(head,i);

        System.out.println("Before the deletion: ");
        display(head);
        System.out.println();

        System.out.println("After the deletion");
        deleteLinkedList(head);
        display(head);

    }

}