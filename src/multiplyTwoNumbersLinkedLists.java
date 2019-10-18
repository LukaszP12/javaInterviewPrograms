public class multiplyTwoNumbersLinkedLists {

    static class Node {
        int data;
        Node next;
    }

    static Node newNode(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }

    // function to return a node at the
    // beginning of the linked list
    static Node push(Node head, int new_data){
        Node new_node = newNode(new_data);

        new_node.next = head;

        head = new_node;
        return head;
    }

    // printing the linked list
    static void printList(Node node){
            while (node != null){
                System.out.println("The node following is: "  + node.data);
                node = node.next;
            }
        System.out.println("\n");
    }

    // multiply contents of two linked lists
    static long multiplyTwoLists(Node first, Node second)
    {
        int num1 = 0, num2 = 0;

        while (first != null || second != null)
        {
            if(first != null)
            {
                num1 = num1*10 + first.data;
                first = first.next;
            }

            if (second != null)
            {
                num2 = num2*10 + second.data;
                second = second.next;
            }
        }
        return num1*num2;
    }

    public static void main(String[] args) {
        Node first = null;
        Node second = null;

        first = push(first, 6);
        first = push(first, 4);
        first = push(first, 9);
        System.out.println("First List is : ");
        printList(first);

        second = push(second,4);
        second = push(second,8);
        printList(second);

        System.out.println("Result is: ");
        System.out.println(multiplyTwoLists(first,second));

    }

}