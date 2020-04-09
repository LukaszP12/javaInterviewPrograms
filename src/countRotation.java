public class countRotation {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int countRotation(Node head){

        int count = 0;
        int min = head.data;

        while (head != null){
            if (head.data < min){
                break;
            }
            count++;
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {
        head = new Node(18);
        head.next = new Node(20);
        head.next.next = new Node(7);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(13);
        head.next.next.next.next.next = new Node(15);

        System.out.println("The number of rotations is :" + countRotation(head));

    }

}
