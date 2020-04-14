public class demoPointer {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);

        Node node2 = new Node(4);
        node2.next = new Node(5);
        node2.next.next = new Node(6);

        node2 = node1;

        while (node2 != null){
            node2.data += 1;
            System.out.println(node2.data + " ");
            node2 = node2.next;
        }

        System.out.println("The original node1: ");

        while (node1 != null){
            System.out.println(node1.data + " ");
            node1 = node1.next;
        }

    }

}
