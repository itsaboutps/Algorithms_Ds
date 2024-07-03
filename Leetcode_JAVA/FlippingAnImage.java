package LeetcodeProblems;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][] image={{1,1,0},{1,0,1},{0,0,0}};
        flippingImage(image);
    }

    private static void flippingImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int lo = 0, hi = A[0].length - 1;
            while (lo <= hi) {
                if (A[i][lo] == A[i][hi]) {
                    A[i][lo] = 1 - A[i][lo];
                    A[i][hi] = A[i][lo];
                }
                lo++;
                hi--;
            }
        }
        
        System.out.println((Arrays.toString(A)));

    }

}
