import javax.print.attribute.standard.NumberUp;

public class nodesInLoop {

    static Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node newNode(int key)
    {
        Node temp = new Node(key);
        return temp;
    }


    static int countNodes(Node head){
        Node temp = head;
        int count = 0;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    static int findTheLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return countNodes(slow);
            }
        }

        return -1;
    }

    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        head =  newNode( 1);
        head.next =  newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);

        head.next.next.next.next.next = head.next;

        System.out.println(findTheLoop(head));
    }

}
