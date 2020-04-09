public class deleteNodeByPointer {

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteNode(Node delete){
        Node temp = delete.next;
        delete.data = temp.data;
        delete.next = temp.next;
        temp = null;
    }

    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        deleteNodeByPointer list = new deleteNodeByPointer();
        for (int i=0; i<5;i++){
            list.push(i);
        }

        list.display(list.head);

        // deleting the head
        list.deleteNode(list.head);

        System.out.println("After deleting the head node");
        list.display(list.head);

    }


}
