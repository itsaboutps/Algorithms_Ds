// package LeetcodeProblems;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        int []nums = {1,3,4,4,2,9};
        // sortduplicateEle(nums);
        System.out.println(hashSetduplicateEle(nums));
    }

    private static int hashSetduplicateEle(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!hs.add(nums[i])){
                return nums[i];
            }
        }
        return nums.length;
    }

    private static int sortduplicateEle(int[] nums) {
        // int []nums = {1,3,4,4,2,9};
        Arrays.sort(nums); //it uses kind of quick sort algo
        System.out.println(Arrays.toString(nums));
        int temp = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=temp){
                temp = nums[j];
            }
            else{
                break;
                // return temp;
            }
        }
        return temp;
        // System.out.println(temp);
    }
}
