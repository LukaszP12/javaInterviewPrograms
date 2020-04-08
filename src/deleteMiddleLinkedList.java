public class deleteMiddleLinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // find middle of linked list

    public static Node deleteMiddleLinkedList(Node head){

        if (head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }

        //2 pointers
        Node slowerPointer = head;
        Node fasterPointer = head;
        Node prev = null;

        while (fasterPointer != null && fasterPointer.next != null){
            fasterPointer = fasterPointer.next.next;
            prev = slowerPointer;
            slowerPointer = slowerPointer.next;
        }

        prev.next = slowerPointer.next;

        return head;
    }


    public static void display(Node head){
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next =  new Node(2);
        head.next.next =  new Node(3);
        head.next.next.next =   new Node(4);
        head.next.next.next.next =  new Node(5);
        head.next.next.next.next.next =  new Node(6);
        head.next.next.next.next.next.next =  new Node(7);
        head.next.next.next.next.next.next.next =  new Node(8);
        head.next.next.next.next.next.next.next.next =  new Node(9);
        head.next.next.next.next.next.next.next.next.next =  new Node(10);

        display(head);

        Node middleElement = deleteMiddleLinkedList(head);

        display(middleElement);
    }


}