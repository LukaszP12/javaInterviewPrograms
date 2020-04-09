public class middleNodeHead {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     static void makeMiddleNodeHead(Node head){

         if (head == null)
             return;

           Node slowPointer = head;
           Node fasterPointer = head;
           Node prev = null;

           while (fasterPointer != null && fasterPointer.next != null){
               prev = slowPointer;
               fasterPointer = fasterPointer.next.next;
               slowPointer = slowPointer.next;
           }
           prev.next = prev.next.next;

           slowPointer.next = head;
           head = slowPointer;
     }

    static void display(Node head){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            System.out.println(temp.data + " ");
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
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(10);

        makeMiddleNodeHead(head);
        display(head);

    }

}