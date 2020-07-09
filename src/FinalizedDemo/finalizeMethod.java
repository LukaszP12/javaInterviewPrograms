package FinalizedDemo;

public class finalizeMethod {

    public static void main(String[] args) {
        while (true){
            new Box().finalized();
        }
    }

    static class Box {
        Box() {
            super();
            System.out.println("This object reference is located on the heap at: " + this);
        }

        //finalized() is not called when an object is no longer in scope
        //finalized() is called prior to garbage collection
        protected void finalized(){
            System.out.println("!!!Finalized!!!" + this);
        }

    }

}
