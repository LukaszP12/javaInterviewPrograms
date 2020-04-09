public class loopKthPosition {

    static class Node
    {
        int data;
        Node next;
    }

    static Node makeloop(Node head_ref, int k)
    {
        // traverse the linked list until loop point not found
        Node temp = head_ref;

        int count = 1;
        while (count < k){
            temp = temp.next;
            count++;
        }

        Node joint_point = temp;

        // traversing till the end
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = joint_point;

        return head_ref;
    }

     static Node push(Node head_ref,int new_data){
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static void display(Node head_ref,int totalNodes){
        int count = 0;
        while (head_ref.next != null && count<totalNodes){
            System.out.println(head_ref.data + " ");
            head_ref = head_ref.next;
            count++;
        }
        System.out.println();
    }

    static int countNodes(Node head_ref){
        int count = 0;
        while (head_ref != null){
            head_ref = head_ref.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head,1);
        head = push(head,2);
        head = push(head,3);
        head = push(head,4);
        head = push(head,5);
        head = push(head,6);
        head = push(head,7);

        int totalNodes = countNodes(head);

        makeloop(head,2);
        display(head,totalNodes);
    }

}
