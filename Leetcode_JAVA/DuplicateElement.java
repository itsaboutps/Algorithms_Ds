// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// package LeetcodeProblems;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int []arr={1,1,1,1,1,1,2,2,2,3,3};
        // approachOne(arr);
        approachOne(arr);
        // System.out.println( approachTwo(arr));
    //    ;
    }

    private static void approachOne(int[] nums) {
        int index=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                nums[index++]=nums[i+1];
            }
        }
        System.out.println("DuplicateElement.approachOne()"+Arrays.toString(nums));
    }

    // private static void approachTwo(int[] arr) {
    //     if(arr.length==0){
    //         // return 0;
    //     }
    //     if(arr.length ==1){
    //         // return 1;
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         // System.out.println(arr[i]);
    //         if(arr[i] == arr[i+1]){
    //             arr[i+1]=arr[i+2];
    //         }
    //         System.out.println(Arrays.toString(arr));
    //     }
    //     // return 0;

    // }

    // private static void approachOne(int []arr) {
    //     Set<Integer> data = new HashSet<Integer>();   
    //     int count=0;
    //     for(int ele:arr){
    //         // data.add(ele);
    //         if(data.add(ele)){
    //             count+=1;
    //         }

    //     }
    //     System.out.println(Arrays.toString(arr));
    //     System.out.println(count);  
    //     System.out.println(data);        

    // }
}
