public class swapNodes {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // head of the list

    public void swapNodes(int x, int y){
        if (x == y) return; // if x and y are the same there is nothing to do

        // search for x
        Node prevX = null, currX = head;
        while (currX != null && currX.data !=x)
        {
            prevX = currX;
            currX = currX.next;
        }

        // search for y
        Node prevY = null, currY = head;
        while (currY != null & currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }

        //  if either x or y is not present, nothing to do
        if(currX == null || currY == null)
            return;

        // if x is not head of linked list
        if(prevX != null)
            prevX.next = currY;
        else // make y
            head = currY;

        // if y is not head of linked list
        if(prevY != null)
            prevY.next = currX;
        else
            head = currX;

        // swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // function to add Node at beginning of list
    public void push(int new_data){
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public void printList(){
        System.out.println("Printing the list");

        Node tNode = head;
        while (tNode != null){
            System.out.println(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        swapNodes nodes = new swapNodes();

        nodes.push(7);
        nodes.push(6);
        nodes.push(5);
        nodes.push(4);
        nodes.push(3);
        nodes.push(2);
        nodes.push(1);

        System.out.println("\n Linked list before calling function");
        nodes.printList();

        nodes.swapNodes(4,3);

        System.out.println("\n Linked list after calling function");
        nodes.printList();

    }

}
