public class MergeLists {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Method to insert a node at the end of the linked list
    public void addToTheLast(Node node)
    {
        if(head == null){
            head = node;
        }else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    // Method to print linked list
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeLists lists1 = new MergeLists();
        MergeLists lists2 = new MergeLists();

        lists1.addToTheLast(new Node(5));
        lists1.addToTheLast(new Node(10));
        lists1.addToTheLast(new Node(15));

        lists2.addToTheLast(new Node(2));
        lists2.addToTheLast(new Node(3));
        lists2.addToTheLast(new Node(20));

    }

}