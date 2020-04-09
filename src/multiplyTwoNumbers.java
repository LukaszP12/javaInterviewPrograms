public class multiplyTwoNumbers {

    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int multiple2Numbers(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        int number1 = 0, number2 = 0;

        while (temp1 != null){
            number1 = number1*10 + temp1.data;
            temp1 = temp1.next;
        }

        while (temp2 != null){
            number2 = number2*10 + temp2.data;
            temp2 = temp2.next;
        }

        return number1*number2;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(2);
        head2.next = new Node(2);

        System.out.println("The result is : " + multiple2Numbers(head1,head2));
    }

}
