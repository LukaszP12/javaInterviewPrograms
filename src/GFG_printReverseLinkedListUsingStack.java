import java.util.Stack;

public class GFG_printReverseLinkedListUsingStack {

    static class Node {
        int data;
        Node next;

    }

    static Node push(Node head_ref, int new_data)
        {
            Node new_node = new Node();
            new_node.data = new_data;
            new_node.next = head_ref;
            head_ref = new_node;
            return head_ref;
        }

        static int getCount(Node head){
        int count = 0;
        Node temp = head;
        while (temp.next != null){
                count++;
                temp = temp.next;
            }
        return count;
    }

    static int getNth(Node head, int n)
    {
        Node curr = head;
        for (int i=0; i<n-1 && curr !=null;i++){
            curr = curr.next;
        }
        return curr.data;
    }

    static void printReverse(Node head)
    {
        // store Node addresses in stack
        Stack<Node> stack = new Stack<Node>();
        Node ptr = head;
        while (ptr != null){
            stack.push(ptr);
            ptr = ptr.next;
        }

        while (stack.size() > 0){
            System.out.println(stack.peek().data + " ");
            stack.pop();
        }

        System.out.println( "\n" );
    }

    public static void main(String[] args) {
        Node head = null;

        head = push(head,5);
        head = push(head,4);
        head = push(head,3);
        head = push(head, 2);
        head = push(head, 1);

        printReverse(head);
    }

}
