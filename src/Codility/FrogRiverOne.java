package Codility;

public class FrogRiverOne {

    public static int solution(int X, int[] A) {

        int max = 0;
        int lastSecond = 0;
        int[] alreadyFallen = new int[A.length];

        for (int i=0; i < alreadyFallen.length; i++){
            alreadyFallen[i] = -1;
        }

        for (int i = 0; i < A.length; i++) {
            int position = A[i];
            alreadyFallen[position - 1] = i;

            if (A[i] > max) {
                max = A[i];
            }
        }

            int latestLeaf = 0;

          for (int i = X-1; i < max; i++){
              if (alreadyFallen[i] >= 0){
                  if (alreadyFallen[i] > latestLeaf){
                      latestLeaf = alreadyFallen[i];
                  }
              } else {
                  return -1;
              }
          }

        if (max == 0) {
            return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int A[] = {1,3,1,4,2,3,5,4};
        System.out.println(solution(5,A));
    }

}