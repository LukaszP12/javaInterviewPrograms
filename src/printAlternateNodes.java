public class printAlternateNodes {

        static Node head;

        static class Node {
            int data;
            Node next;
        }


        static Node push(Node head, int data){
            Node new_node = new Node();
            new_node.data = data;
            new_node.next = head;
            head = new_node;
            return head;
        }

        static void deleteAlternateNodes(Node head){

            if (head == null)
                return;

            Node prev = head;
            Node curr = head.next;

            while (prev != null && curr != null ){

                prev.next = curr.next;

                curr = null;

                prev = prev.next;
                if (prev != null)
                    curr = prev.next;
            }
        }

        static void deleteRecur(Node head){
            if (head == null)
                return;

            Node next = head.next;

            head.next = next.next;

            deleteRecur(head.next);

        }

        static void display(Node head){
            Node temp = head;

            while (temp.next != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            Node head = null;

            head = push(head, 10);
            head = push(head, 9);
            head = push(head, 8);
            head = push(head, 7);
            head = push(head, 6);
            head = push(head, 5);
            head = push(head, 4);
            head = push(head, 3);
            head = push(head, 2);
            head = push(head, 1);

            deleteAlternateNodes(head);
            display(head);

            //deleteRecur(head);
            //display(head);
        }


    }
