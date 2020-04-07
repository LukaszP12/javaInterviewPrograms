

public class sortLinkedList012 {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void sort(){
        int count[] = {0,0,0};

        Node temp = head;

        while (temp.next != null){
            count[temp.data]++;
            temp = temp.next;
        }

        int i = 0;
        temp = head;

        while (temp != null && i<3){
            if(count[i] == 0){
                i++;
            }else {
                temp.data = i;
                --count[i];
                temp = temp.next;
            }
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public void printList()
    {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sortLinkedList012 list = new sortLinkedList012();

        list.push(0);
        list.push(1);
        list.push(0);
        list.push(2);
        list.push(1);
        list.push(1);
        list.push(2);
        list.push(1);
        list.push(2);

        System.out.println("List before sorting ");
        list.printList();

        list.sort();

        System.out.println("List after sorting ");
        list.printList();
    }

}
