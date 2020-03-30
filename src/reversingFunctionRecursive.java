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


}


