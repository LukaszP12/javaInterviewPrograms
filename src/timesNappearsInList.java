public class timesNappearsInList {
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // how many times the number appear in the list
    public int count(int search_for){
        int count = 0;
        Node temp = head;

        while (temp.next != null){
            if (temp.data == search_for){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        timesAnumberAppears list = new timesAnumberAppears();
        list.push(1);
        list.push(2);
        list.push(1);
        list.push(3);
        list.push(1);

        System.out.println("Count of 1 is " + list.count(1));
    }

}