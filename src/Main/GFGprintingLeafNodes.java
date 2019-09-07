package Main;

public class GFGprintingLeafNodes {

    // A binary tree node
    static class Node
    {
        int data;
        Node left, right;
    };

    // Utility function to  create a new tree node
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    // Function to print leaf
    // nodes from right to leaf
    static void printLeafNode(Node root)
    {
        //if node is null, return null
        if(root == null)
            return;

        // if node is leaf node, print its data
        if (root.left == null && root.right == null)
        {
            System.out.println(root.data + " ");
            return;
        }

        // If right child exists, check for leaf
        // recursively
        if(root.right != null)
            printLeafNode(root.right);

        // If left child exists, check for leaf
        // recursively
        if(root.left != null)
            printLeafNode(root.left);
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(6);
        root.right.right = newNode(7);
        root.left.left.left = newNode(8);
        root.right.right.left = newNode(9);
        root.left.left.left.right = newNode(10);

        printLeafNode(root);
    }

}