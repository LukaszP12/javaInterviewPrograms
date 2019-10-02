/*
Given two linked list of equal sizes, the task is to create new linked list using those linked lists where at every step,
the maximum of the two elements from both the linked lists is chosen and the other is skipped.
 */

public class GFG_linkedListTwoLinkedLists {
    // Representation  of node
    static class Node
    {
        int data;
        Node next;
    }

    // Function to insert node in a linked list
    static Node insert(Node root, int item)
    {
        Node ptr, temp;
        temp = new Node();
        temp.data = item;
        temp.next = null;

        if (root == null)
            root = temp;
        else
        {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;

            ptr.next = temp;
        }
        return root;
    }

    static void display(Node root)
    {
        while (root != null)
        {
            System.out.println(root.data + " - > ");
            root = root.next;
        }
        System.out.println("null");
    }

    // Function to generate the required
    // linked list and return it head
    static Node newList(Node root1, Node root2)
    {
        Node ptr1 = root1, ptr2 = root2;
        Node root = null;

        // while there are nodes left
        while (ptr1 != null)
        {
            // Maximum node at current position
            int currMax = ((ptr1.data < ptr2.data) ? ptr2.data : ptr1.data);

            // If current node is the first node
            // of newly linked list being
            // generated then assign it to the root
            if(root == null)
            {
                Node temp = new Node();
                temp.data = currMax;
                temp.next = null;
                root = temp;
            }

            else {
                root = insert(root,currMax);
            }

            // Get to the next nodes
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root1 = null, root2 = null, root = null;

        // First linked list
        root1 = insert(root1, 5);
        root1 = insert(root1, 2);
        root1 = insert(root1, 3);
        root1 = insert(root1, 8);

        // Second linked list
        root2 = insert(root2, 1);
        root2 = insert(root2, 7);
        root2 = insert(root2, 4);
        root2 = insert(root2, 5);

        // Generate the new linked list
        // and get its head
        root = newList(root1,root2);
        display(root);

    }
}