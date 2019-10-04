public class GFG_ProductOfAlternateNodeLinkedLists {

    static class Node
    {
        int data;
        Node next;
    }

    // function to get the alternate nodes of a linked list
    static int productAlternateNode(Node head)
    {
        int count = 0;
        int product = 1;

        while (head != null)
        {
            if(count % 2 == 0){
                product *= head.data;
            }

            head = head.next;

        }
        return product;
    }

    static Node push(Node head, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = push(head,12);
        head = push(head,29);
        head = push(head, 11);
        head = push(head, 23);
        head = push(head, 8);

        System.out.printf(" %d ", productAlternateNode(head));
    }

}
