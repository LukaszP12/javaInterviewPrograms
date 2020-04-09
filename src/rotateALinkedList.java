
public class rotateALinkedList {

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     void rotate(int k){
        if (k == 0){return;}

        Node current = head;

        int count = 1;
        while (count < k && current != null){
                current = current.next;
                count++;
        }

        if (current == null)
            return;

        // current points to kth node
        Node kthNode = current;

        // we go further
        while (current.next != null)
            current = current.next;

        current.next = head;

        head = kthNode.next;

        kthNode.next = null;

    }

    void display(){
        Node temp = head;

        while (temp.next != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    void push(int new_data){
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public static void main(String[] args) {
        rotateALinkedList llist = new rotateALinkedList();

        for (int i=60; i>=0; i -= 10){
            llist.push(i);
        }

        System.out.println("Given list");
        llist.display();

        llist.rotate(4);

        System.out.println("After rotation");
        llist.display();
    }

}
