package Recursion;

// Call by value and call by reference in Java

public class Operation {
    int data = 50;

    void change(int data){
        data=data+100; // changes will be stored in the local variable only
        System.out.println("The new data is: "  + data + "however it stored in a local variable only");
    }

    public static void main(String[] args) {
        Operation op = new Operation();

        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);
    }

}

