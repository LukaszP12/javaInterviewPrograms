public class reversingFunctionRecursive {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    Node reverseUtil(Node curr, Node prev)
    {
        //if last node mark is head
        if (curr.next == null){
            head = curr;

            //update next to prev node
            curr.next = prev;

            return head;
        }
        // save curr-> node for recursive call
        Node next1 = curr.next;

        // update next...
        curr.next = prev;

        reverseUtil(next1,curr);
        return head;
    }

    void printList(Node node)
    {
        while (node != null)
        {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        reversingFunctionRecursive list = new reversingFunctionRecursive();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original linked list: ");
        list.printList(head);
        Node res = list.reverseUtil(head, null);
        System.out.println("");
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(res);
    }

}


