import java.util.HashMap;

public class firstNonRepeatingInteger {

    static Node head;

    static class Node{
        int data;
        Node next;

    }

    public static Node push(int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = head;
        return head = new_node;
    }

    public static void findNonRepeatingInteger(Node head){
        HashMap<Integer,Integer> hashMap = new HashMap();

        Node temp = head;

        while (temp.next != null){
            if (hashMap.containsKey(temp.data)){
                hashMap.put(temp.data,hashMap.get(temp.data)+1);
            }else {
                hashMap.put(temp.data,1);
            }

            temp = temp.next;
        }

        System.out.println(hashMap.entrySet());
    }

    public static int firstNonRepeating(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
                if (j == n-1)
                    return arr[i];
            }
        }
        return -1;
    }

        public static void main(String[] args) {
        head = push(9);
        head = push(4);
        head = push(9);
        head = push(6);
        head = push(7);
        head = push(4);

        findNonRepeatingInteger(head);

        int tab[] = new int[]{9,4,9,6,7,4};
        System.out.println("The elements do not repeat: " + firstNonRepeating(tab,tab.length));

    }
}
