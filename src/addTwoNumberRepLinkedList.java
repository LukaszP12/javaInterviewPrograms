import com.sun.security.auth.UnixNumericGroupPrincipal;

public class addTwoNumberRepLinkedList {

    static Node head1, head2;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adds contents of two linked lists and return the head node of resultant list
    Node addTwoLists(Node first, Node second) {
        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        while (first != null || second != null) //while both lists exist
        {
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);

            // update the carry for next calculation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // create a new node with sum as data
            temp = new Node(sum);

            // if this is the first node then set it
            // as head of the resultant list
            if (res == null) {
                res = temp;
            } else {
                prev.next = temp;
            }
            // set prev for next inserion
            prev = temp;

            // move first and second pointers to next nodes
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }

            if (carry > 0) {
                temp.next = new Node(carry);
            }

        }
        return res;
    }

        //utility function to print a linked list
        void printList(Node head){
            while (head != null){
                System.out.println(head.data + " ");
                head = head.next;
            }
            System.out.println("");
        }


    public static void main(String[] args) {
        addTwoNumberRepLinkedList linkedList = new addTwoNumberRepLinkedList();

        // creating first list
        linkedList.head1 = new Node(7);
        linkedList.head1.next = new Node(5);
        linkedList.head1.next.next = new Node(9);
        linkedList.head1.next.next.next = new Node(4);
        linkedList.head1.next.next.next.next = new Node(6);
        System.out.println("First List is ");
        linkedList.printList(head1);

        // creating second list
        linkedList.head2 = new Node(8);
        linkedList.head2.next = new Node(4);
        System.out.println("Second list is ");
        linkedList.printList(head2);

        Node rs = linkedList.addTwoLists(head1,head2);
        System.out.println("Resultant List is ");
        linkedList.printList(rs);

    }

}
