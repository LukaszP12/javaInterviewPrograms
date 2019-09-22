package Main;

import java.util.Stack;

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

    // Function to print all the leaf nodes
    // of binary tree using one stack
    static void printLeafRightToLeft(Node p)
    {
        // stack to store the nodes
        Stack<Node> s = new Stack<>();

        while (true)
        {
            // If p is not null the push
            // it on the stack
            if (p != null)
            {
                s.push(p);
                p = p.right;
            } else {
                // if stack is empty then come out of the loop
                if (s.isEmpty())
                    break;
                else
                {
                    if (s.peek().left == null)
                    {
                        p = s.peek();
                        s.pop();

                        // print the leaf node
                        if(p.right == null)
                            System.out.println( p.data + " ");
                    }

                    while (p == s.peek().left)
                    {
                        p = s.peek();
                        s.pop();

                        if(s.empty())
                            break;
                    }

                    // If stack is not empty then assign p as
                    // the stack's top node's lef child
                    if(!s.empty())
                        p = s.peek().left;
                    else
                        p = null;
                }
            }

        }

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

        //printLeafNode(root);
        printLeafRightToLeft(root);
    }

}