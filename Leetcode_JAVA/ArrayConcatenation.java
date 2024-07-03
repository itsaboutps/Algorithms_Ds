//https://leetcode.com/problems/concatenation-of-array/
//1929. Concatenation of Array
package LeetcodeProblems;
import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int []arr={1,2,1};
        concatArr(arr);
    }
    public static void concatArr(int[] nums){
        int[] result = new int[nums.length * 2];
	    for(int i=0;i<nums.length;i++)
		result[i + nums.length] = result[i] = nums[i];
        System.out.println(Arrays.toString(result));
    }
}
