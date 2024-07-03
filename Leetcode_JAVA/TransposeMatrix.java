//https://leetcode.com/problems/transpose-matrix/
package LeetcodeProblems;

import java.util.Arrays;

public class TransposeMatrix{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        transposeMatrix(arr);
    }
    private static void transposeMatrix(int[][] arr) {
        int [][] newArr=new int [arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
            for (int j = 0; j <arr.length; j++) {
                System.out.println(arr[i][j]);
                newArr[j][i]=arr[i][j];
                
            }
            
            
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr[i]));
        }
    }
    
}