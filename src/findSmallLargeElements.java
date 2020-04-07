public class findSmallLargeElements {

        static Node head = null;

        static class Node {
            int data;
            Node next;
        }

        static int largestElement(Node head){
            int max = Integer.MIN_VALUE;

            Node temp = head;

            while (temp != null){
                if (temp.data > max){
                    max = temp.data;
                }

                temp = temp.next;
            }
            return max;
        }

        static int smallestElement(Node head){
            int min = Integer.MAX_VALUE;

            Node temp = head;

            while (temp != null){
                if (temp.data < min){
                    min = temp.data;
                }

                temp = temp.next;
            }
            return min;
        }

        public void push(int new_data)
        {
            Node new_node = new Node();

            new_node.data = new_data;

            new_node.next = head;

            head = new_node;
        }

        public void printList(Node head)
        {
            Node temp = findSmallLargeElements.head;

            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            findSmallLargeElements list = new findSmallLargeElements();

            list.push(15);
            list.push(14);
            list.push(13);
            list.push(22);
            list.push(17);

            list.printList(head);

            System.out.println("Minimum in linked list is: " + list.smallestElement(head));

            System.out.println("Maximum in linked list is: " + list.largestElement(head));

        }


    }