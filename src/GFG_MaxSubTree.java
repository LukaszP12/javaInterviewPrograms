// Maximum sub-tree sum in
// a Binary Tree such that
// the sub-tree is also a bst

public class GFG_MaxSubTree {

    static class Node
    {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    };

    // Information stored in every
    // node during bottom up traversal
    static class Info
    {
        //Max value in the subtree
        int max;

        //Min value in the subtree
        int min;

        //If subtree is BST
        boolean isBST;

        // Sum of the nodes of the sub-tree
        // rooted under the current node
        int sum;

        // Max sum of BST found till now
        int currmax;


        public Info(int max, int min, boolean isBST, int sum, int currmax) {
            this.max = max;
            this.min = min;
            this.isBST = isBST;
            this.sum = sum;
            this.currmax = currmax;
        }

        public Info() {
        }
    };

    static class INT
    {
        int a;
    }

    // Returns information about subtree such as
    // subtree with the maximum sum which is also a BST
    static Info MaxSumBSTUtil(Node root, INT maxsum)
    {
        if(root == null)
            return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0,0);

        //if current node is leaf node then
        //return from the function and store
        //information about the leaf node
        if(root.left == null && root.right == null){
            maxsum.a = Math.max(maxsum.a, root.data);
            return new Info(root.data, root.data, true, root.data, maxsum.a);
        }

        // Store information about the left subtree
        Info L = MaxSumBSTUtil(root.left, maxsum);

        // Store information about the right subtree
        Info R = MaxSumBSTUtil(root.right, maxsum);

        Info BST = new Info();

        // If the subtree rooted under the current node
        // is a BST
        if(L.isBST && R.isBST && L.max < root.data && R.min > root.data)
        {
            BST.max = Math.max(root.data, Math.max(L.max, R.max));
            BST.min = Math.min(root.data, Math.min(L.min, R.min));

            maxsum.a = Math.max(maxsum.a, R.sum + root.data + L.sum);
            BST.sum = R.sum + root.data + L.sum;

            // Update the current maximum sum
            BST.currmax = maxsum.a;

            BST.isBST = true;
            return BST;
        }

        // if the whole tree is not a BST then
        // update the current maximum sum
        BST.isBST = false;
        BST.currmax = maxsum.a;
        BST.sum = R.sum + root.data + L.sum;

        return BST;
    }

    // Function to return the maximum
    // sum subtree which is also a BST
    static int MaxSumBST(Node root)
    {
        INT maxsum = new INT();
        maxsum.a = Integer.MIN_VALUE;
        return MaxSumBSTUtil(root, maxsum).currmax;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);

        System.out.println(MaxSumBST(root));
    }

}