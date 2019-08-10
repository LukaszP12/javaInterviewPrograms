// Fibonacci sequence are the numbers in the following integer sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144..

public class MyFibonacci {

    public static void main(String[] args) {

        int febCount = 15;
        int feb[] = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;

        // initiliazing the fib sequence
        for (int i=2; i<febCount; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        //displaying the fib sequence
        for(int i=0; i<febCount;i++){
            System.out.println("Fib sequence: " + i +":" + feb[i] + " ");
        }
    }

}
