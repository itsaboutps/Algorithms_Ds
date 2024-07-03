package LeetcodeProblems;

import java.util.Arrays;

public class SmallerThanCurrent {
public static void main(String[] args) {
    int []arr = {8,1,2,2,3};

    System.out.print(Arrays.toString(smallerNumbersThanCurrent(arr)));
}
// class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
        int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    count+=1;
                }
            }
            result[i]=count;
            
        }
        return result;
    }
}