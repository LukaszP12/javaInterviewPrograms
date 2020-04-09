public class checkListIsPalindrome {

    Node head;

    static class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    boolean isPalidromeUtil(String str){
        int length = str.length();

        for (int i=0; i<length;i++)
            if (str.charAt(i) != str.charAt(length - i -1))
                return false;

        return true;
    }

    //returns true if string formed by linked list is palindrome
    boolean isPalidrome()
    {
        Node node = head;

        String str = "";
        while (node != null)
        {
            str = str.concat(node.data);
            node = node.next;
        }

        return isPalidromeUtil(str);
    }

    public static void main(String[] args) {
        checkListIsPalindrome list = new checkListIsPalindrome();
        list.head = new Node("a");
        list.head.next = new Node("bc");
        list.head.next.next = new Node("d");
        list.head.next.next.next = new Node("dcb");
        list.head.next.next.next.next = new Node("a");

        System.out.println(list.isPalidrome());
    }

}
