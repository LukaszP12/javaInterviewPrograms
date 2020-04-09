public class linkedListPairwiseSwap {

    static Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void pairWiseSwap(){

        Node temp = head;

        while (temp != null && temp.next != null){
           int k = temp.data;
           temp.data = temp.next.data;
           temp.next.data = k;
           temp = temp.next.next;
        }
    }

    public static void display(Node head){

        while (head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        pairWiseSwap();
        display(head);
    }

}
