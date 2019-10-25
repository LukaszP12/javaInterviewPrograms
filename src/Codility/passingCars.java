package Codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class passingCars {

    public static int solution(int[] A) {
        int count = 0;
        int multiply = 0;

        for (int car : A) {
            if (car == 0) {
                multiply++;
            }
            if (car == 1) {
                count = count + multiply;
            }
        }

        return count;
    }

    public static void main(String[] args) {
            int[] A = {0,1,0,1,1};
            System.out.println(solution(A));
    }

}