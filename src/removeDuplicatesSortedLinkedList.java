public class removeDuplicatesSortedLinkedList {

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; }
    }

    void removeDuplicates(){
        Node curr = head;

        while (curr != null){
            Node temp = curr;

            while (temp!=null && temp.data==curr.data){
                temp = temp.next;
            }

         curr.next = temp;
         curr = curr.next;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public void printList(){
        Node temp = head;
        while (temp !=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        removeDuplicatesSortedLinkedList list = new removeDuplicatesSortedLinkedList();
        list.push(20);
        list.push(13);
        list.push(13);
        list.push(11);
        list.push(11);
        list.push(11);

        System.out.println("List before removal ");
        list.printList();

        list.removeDuplicates();

        System.out.println("List after removal ");
        list.printList();
    }
}
