//https://leetcode.com/problems/matrix-diagonal-sum/
package LeetcodeProblems;
public class DiagonalSum {
    public static void main(String[] args) {
        int [][]arr={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        diagonalSum(arr);
    }

    private static void diagonalSum(int[][] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i]+arr[i][((arr.length)-1)-i];        
        }
        if(arr.length%2!=0){
            sum-=arr[arr[0].length/2][arr[0].length/2];
        }

        System.out.println(sum);
    }

    
}
