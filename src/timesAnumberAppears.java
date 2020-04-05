public class timesAnumberAppears {

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

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // count the number of occurrenes of a node
    int count(int search_of)
    {
        int count = 0;

        while (head != null){
            if(head.data == search_of){
                count++;
            }
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {
        timesAnumberAppears appears = new timesAnumberAppears();

        appears.push(1);
        appears.push(2);
        appears.push(1);
        appears.push(3);
        appears.push(1);

        System.out.println("Count of 1 is " + appears.count(1));
    }

}
