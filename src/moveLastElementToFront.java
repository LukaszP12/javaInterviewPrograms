public class moveLastElementToFront {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void moveToFront(){
        if (head == null || head.next == null){
            return;
        }

        Node secLast = null;
        Node last = head;

        while (last.next != null){
            secLast = last;
            last = last.next;
        }

        secLast.next = null;

        last.next = head;

        head = last;
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        moveLastElementToFront list = new moveLastElementToFront();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Linked list before moving last to front ");
        list.printList();

        list.moveToFront();

        System.out.println("Linked list after moving last to front ");
        list.printList();
    }

}
