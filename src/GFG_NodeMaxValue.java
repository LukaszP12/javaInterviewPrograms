// Find the node with maximum value in a binary tree search tree using recursion

// Aproach: just traverse the node from root to right recursively until right is NULL.
// The node whose right is NULL is the node with the maximum value.

public class GFG_NodeMaxValue {

    static class node
    {
        int data;
        node left;
        node right;
    };

    static node newNode(int data)
    {
        node node = new node();
        node.data = data;
        node.left = null;
        node.right = null;

        return (node);
    }

    static node insert(node node, int data)
    {
        // 1. If tree is empty, return a new, single node
        if(node == null)
            return (newNode((data)));
        else
        {
            // 2. Otherwise, recur down the tree
            if(data <= node.data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);

            //return the (unchanged) node pointer
            return node;
        }
    }

    // Function to return the maximum node
    // in the given binary search tree
    static int maxValue(node node)
    {
        if(node.right == null)
            return node.data;
        return maxValue(node.right);
    }

    static int minValue(node node)
    {
        if(node.left == null)
            return node.data;
        return minValue(node.left);
    }

    public static void main(String[] args) {
        //create the BST
        node root = null;
        root = insert(root,4);
        root = insert(root,2);
        root = insert(root, 1);
        root = insert(root,3);
        root = insert(root,6);
        root = insert(root, 5);

        System.out.println(maxValue(root));
        System.out.println(minValue(root));
    }

}
