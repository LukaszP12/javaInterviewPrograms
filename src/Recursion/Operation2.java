package Recursion;

public class Operation2 {
    int data = 50;

    void change(Operation2 op){
        op.data = op.data  + 100; // changes will be made in the instance variable
        System.out.println("After changes have been made in the instance variable");
    }

    public static void main(String[] args) {
        Operation2 operation2 = new Operation2();

        System.out.println("before change"+operation2.data);
        operation2.change(operation2);
        System.out.println("after change"+operation2.data);

    }

}
