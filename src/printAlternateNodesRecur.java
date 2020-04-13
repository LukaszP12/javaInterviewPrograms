public class printAlternateNodesRecur {

    static Node head;

    static class Node{
        int data;
        Node next;
    }

    static Node push(Node head, int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = head;
        head = new_node;
        return head;
    }

    static void printAlterNodesRecur(Node head){

        if (head == null)
            return;

        System.out.println(head.data);

        printAlterNodesRecur(head.next.next);

    }

    public static void main(String[] args) {

        Node head = null;

        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        printAlterNodesRecur(head);

    }

}
