public class identicalListedList {

    static class Node{
        int n;
        Node next;

        public Node(int n) {
            this.n = n;
            this.next = null;
        }
    }

    static boolean identicalList(Node head1,Node head2){

        Node a = head1;
        Node b = head2;

        while (a != null && b != null){
            if (a.n != b.n){
                return false;
            }
            a = a.next;
            b = b.next;
        }

        return (a == null && b == null);
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);

        if (identicalList(head1,head2) == true){
            System.out.println("The lists are identical");
        }else {
            System.out.println("They are not identical");
        }
    }

}
