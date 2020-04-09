public class middleNodeHead {

    Node head;

    class Node {
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
           Node prev = head;

           while (fasterPointer != null && fasterPointer.next != null){
               prev = slowPointer;
               slowPointer = slowPointer.next;
               fasterPointer = fasterPointer.next.next;
           }
           prev.next = prev.next.next;

           slowPointer.next = head;
     }

    void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
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
        middleNodeHead list = new middleNodeHead();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);

        makeMiddleNodeHead(list.head);
        display(list.head);

    }

}