import javax.imageio.stream.ImageInputStreamImpl;

public class sortListAlreadySortedByMod {

        static Node head;

        static class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }


       static Node sortedList(Node head) {
           Node prev = head;
           Node curr = head.next;

           while (curr.next != null) {
               if (prev.data > curr.data) {
                   Node temp = curr;
                   curr = prev;
                   prev = temp;
               }
               curr = curr.next;
           }

           return curr;
       }

        public void push(int new_data)
        {
            Node new_node = new Node(new_data);

            new_node.next = head;

            head = new_node;
        }

        static void printList(Node head)
        {
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        sortListAlreadySortedByMod list = new sortListAlreadySortedByMod();

        list.push(-5);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(-2);
        list.push(1);
        list.push(0);

        sortedList(head);
        printList(head);

    }

    }
