public class insertLinkedListAtKthPosition {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insert(Node head1, Node head2, int k) {
        int i = 1;
        Node curr = head1;
        while (i < k) {
            curr = curr.next;
            i++;
        }
        Node temp = curr.next;

        curr.next = head2;

        while (head2 != null)
            head2 = head2.next;

        head2.next = temp;
        return head1;
    }


}
