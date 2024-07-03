//https://leetcode.com/problems/running-sum-of-1d-array/
package LeetcodeProblems;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        runningSum(arr);
    }
    public static void runningSum(int[] nums){

        int[] result = new int[nums.length];
	    for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            result[i]=sum;

        }
        System.out.print(Arrays.toString(result));
    }
}
