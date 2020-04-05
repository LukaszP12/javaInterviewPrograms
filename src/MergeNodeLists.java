public class MergeNodeLists {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class MergeLists {
        Node head;

        public void addToTheLast(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

         void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MergeLists list1 = new MergeLists();
        MergeLists list2 = new MergeLists();

        list1.addToTheLast(new Node(5));
        list1.addToTheLast(new Node(10));
        list1.addToTheLast(new Node(15));

        list2.addToTheLast(new Node(2));
        list2.addToTheLast(new Node(3));
        list2.addToTheLast(new Node(10));

        //list1.head = new Gfg().sortedMerge(list1.head,list2.head);
        //list1.printList();

        list1.head = new Gfg().sortedMerge2(list1.head,list2.head);
        list1.printList();

    }


    static class Gfg {
        Node sortedMerge(Node headA, Node headB) {
            Node dummyNode = new Node(0);

            Node tail = dummyNode;
            while (true) {
                if (headA == null) {
                    tail.next = headB;
                    break;
                }
                if (headB == null) {
                    tail.next = headA;
                    break;
                }

                if (headA.data <= headB.data) {
                    tail.next = headA;
                    headA = headA.next;
                } else {
                    tail.next = headB;
                    headB = headB.next;
                }

                tail = tail.next;
            }
            return dummyNode.next;
        }

        public Node sortedMerge2(Node A, Node B){
            if(A == null) return B;
            if(B == null) return A;

            if (A.data < B.data){
                A.next = sortedMerge2(A.next,B);
                return A;
            } else {
                B.next = sortedMerge2(A,B.next);
                return B;
            }
        }

    }
}
