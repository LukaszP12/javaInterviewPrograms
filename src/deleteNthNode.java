public class deleteNthNode {

    static class Node {
        int data;
        Node next;
    }

    static Node create(Node head, int x) {
        Node pointer = head;
        Node temp = new Node();
        temp.data = x;
        temp.next = null;

        if (head == null)
            head = temp;
        else {
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = temp;
        }
        return head;
    }

    static Node removeNthFromEnd(Node head, int B) {
        int len = 0;
        Node temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        if (B > len) {
            System.out.println("We cannot remove the node, as it exceedes the length of the linked list");
            return head;
        } else if (B == len) {
            return head.next;
        } else {
            int diff = len - B;
            Node prev = null;
            Node curr = head;

            for (int i = 0; i < diff; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;

            return head;
        }
    }

    static void display(Node head)
    {
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        System.out.println();
    }


    public static void main(String[] args) {
        Node head = null;

        head = create(head,1);
        head = create(head,2);
        head = create(head,3);
        head = create(head,4);
        head = create(head,5);

        int n = 2;

        System.out.println("List before modification");
        display(head);

        removeNthFromEnd(head,n);
        System.out.println("List after modification");
        display(head);
    }


}