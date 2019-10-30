package Codility;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B){

        if(A.length == 0){
            return 0;
        }

        Stack<Integer> st = new Stack<>();
        int numAlive = A.length;

        for (int i=0; i<A.length;i++){
                if (B[i] == 1){
                    st.push(A[i]);
                }

                if(B[i] == 0){
                    while (! st.isEmpty()){
                        if(st.peek() > A[i]){
                            numAlive--;
                            break;
                        }else if(st.peek() < A[i]){
                            numAlive--;
                            st.pop();
                        }
                    }
                }
        }

        return numAlive;
    }

}
