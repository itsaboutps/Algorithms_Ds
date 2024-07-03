//https://leetcode.com/problems/set-matrix-zeroes/

import java.util.Arrays;

public class ZeroMatrixAppr1 {
    //! ======================> n^3
    public static void main(String[] args) {
        System.out.println("Hi");
        int arr[][]={{0,1,2,0},
                     {3,4,5,2},
                     {1,3,1,5}};
        // System.out.println(arr.length,arr[0].length);
        // 34
        // Arrays.asList(null);
        System.out.println("2D Array "+Arrays.deepToString(arr));
        setZeroes(arr, arr.length,arr[0].length);
    }
    private static void setZeroes(int[][] matrix,int row,int column) {
        for(int i =0; i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==0){
                    markRowZero(matrix,row,column,i);
                    /**
                     * 0
                     * 0
                     * 0 
                     */
                    markColumnZero(matrix,row,column,j);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j]=0;
                }
            }
        }
    }
    private static void markColumnZero(int[][] matrix, int row, int column, int j) {
        for (int i = 0; i < row; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j]=-1;
            }
        }
    }
    //                     * like 00, 10, 20

    private static void markRowZero(int[][] matrix, int row, int column, int i) {
        for (int j = 0; j < column; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

}
