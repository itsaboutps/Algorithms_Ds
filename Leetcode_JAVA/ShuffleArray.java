//https://leetcode.com/problems/shuffle-the-array/
//1470. Shuffle the Array
package LeetcodeProblems;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        //hard code input ====> you can take input form userinput
        int []arr={2,5,1,3,4,7};
        shuffleArray(arr,3);
    }
    public static void shuffleArray(int[] nums,int n){
        int[] result = new int[nums.length];
        int k=0;
        for(int i=0, j =i+n;i<n;i++,j++){
            result[k]=nums[i];
            k+=1;
            result[k]=nums[j];
            k+=1;
        }
        System.out.print(Arrays.toString(result));
    }
}
