public class circularList {

    static Node head;

    static class Node {
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

    static void makeListCircular(Node head){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
    }

    static void display(Node head){
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        head = push(head,1);
        head = push(head,2);
        head = push(head,3);
        head = push(head,4);
        head = push(head,5);
        head = push(head,6);
        head = push(head,7);

        makeListCircular(head);
        display(head);
    }

}
