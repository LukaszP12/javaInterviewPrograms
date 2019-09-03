package Recursion;

public class BinaryNode {

    int root;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int root) {
       this.root = root;
       left = right = null;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

}
