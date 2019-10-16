package Codility;

public class missingElem {

    public int solution(int A[]){

        if (A == null) return 0;
        if(A.length == 0) return 1;

        int total = 0;
        int max = A.length + 1;
        for (int i=0; i< A.length;i++){
            total += A[i];
            max += i+1;
        }

        return (max - total) < 0 ? 0 : (max - total);
    }

}
