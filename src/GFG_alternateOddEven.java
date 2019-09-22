import java.util.Stack;

public class GFG_alternateOddEven {

    // class node
    static class Node
    {
        int data;
        Node next;
    }

    // A utility function to print
    // linked list
    static void printList(Node node)
    {
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println();
    }

    // Function to create a new node
    // in a linkedlist
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }

    // Function to insert at beginning
    static Node insertBeg(Node head, int val)
    {
        Node temp = newNode(val);
        temp.next = head;
        head = temp;
        return head;
    }

    // Function to rearrange the
    // odd and even nodes
    static void rearrangeOddEven(Node head)
    {
        Stack<Node> odd = new Stack<Node>();
        Stack<Node> even = new Stack<Node>();
        int i = 1;

        while (head != null){

            if(head.data % 2 != 0 && i % 2 == 0)
            {
                // Odd value in Even Position
                // Add pointer to current node
                // in odd stack
                odd.push(head);
            }
            else if (head.data % 2 == 0 && i % 2 != 0)
            {
                // Even value in Odd Position
                // Add pointer to current node
                // in even stack
                even.push(head);
            }

            head = head.next;
            i++;
        }

        while (odd.size() > 0 && even.size() > 0)
        {
            // Swap data at the top of two stack
            int k = odd.peek().data;
            odd.peek().data = even.peek().data;
            even.peek().data=k;
            odd.pop();
            even.pop();
        }
    }

    // Function to rearrrange the
    // odd and even nodes
    static Node rearrrange(Node head)
    {
        // Step 1: Segregate even and odd nodes
        // Step 2: Split odd and even lists
        // Step 3: Merge even list into odd list
        Node even;
        Node temp, prev_temp;
        Node i, j, k, l, ptr=null;

        // Step 1: Segregate Odd and Even Nodes
        temp = (head).next;
        prev_temp = head;

        while (temp != null)
        {

            // Backup next pointer of temp
            Node x = temp.next;

            // If temp is odd move the node
            // to beginning of list
            if (temp.data % 2 != 0)
            {
                prev_temp.next = x;
                temp.next = (head);
                (head) = temp;
            }
            else
            {
                prev_temp = temp;
            }

            // Advance Temp Pointer
            temp = x;
        }

        // Step 2
        // Split the List into Odd and even
        temp = (head).next;
        prev_temp = (head);

        while (temp != null && temp.data % 2 != 0)
        {
            prev_temp = temp;
            temp = temp.next;
        }

        even = temp;

        // End the odd List (Make last node null)
        prev_temp.next = null;

        // Step 3:
        // Merge Even List into odd
        i = head;
        j = even;

        while (j != null && i != null)
        {

            // While both lists are not
            // exhausted Backup next
            // pointers of i and j
            k = i.next;
            l = j.next;

            i.next = j;
            j.next = k;

            // ptr points to the latest node added
            ptr = j;

            // Advance i and j pointers
            i = k;
            j = l;
        }

        if (i == null)
        {

            // Odd list exhausts before even,
            // append remainder of even list to odd.
            ptr.next = j;
        }

        // The case where even list exhausts before
        // odd list is automatically handled since we
        // merge the even list into the odd list
        return head;
    }

    // Driver code
    public static void main(String[] args) {
        Node head = newNode(8);
        head = insertBeg(head,7);
        head = insertBeg(head, 6);
        head = insertBeg(head, 5);
        head = insertBeg(head, 3);
        head = insertBeg(head, 2);
        head = insertBeg(head, 1);

        System.out.println("Linked List:");
        printList(head);
        rearrangeOddEven(head);

        System.out.println("Linked list after being reaaranged");
        printList(head);

        System.out.println();

        Node head1 = newNode(8);
        head1 = insertBeg(head1,7);
        head1 = insertBeg(head1,6);
        head1 = insertBeg(head1,5);
        head1 = insertBeg(head1,3);
        head1 = insertBeg(head1,2);
        head1 = insertBeg(head1,1);

        System.out.println("Now according to the 2nd method");
        System.out.println("The 2nd list");
        printList(head1);

        rearrrange(head1);
        System.out.println("Linked list after being reaaranged");
        printList(head1);

    }
}
