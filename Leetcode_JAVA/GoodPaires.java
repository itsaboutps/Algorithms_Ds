//https://leetcode.com/problems/number-of-good-pairs/
//1512. Number of Good Pairs
package LeetcodeProblems;
public class GoodPaires {
    public static void main(String[] args) {
        int []arr = {1,2,3,1,1,3};
        numIdenticalPairs(arr);
    }

    private static void numIdenticalPairs(int[] nums) {
        int count=0;
        
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        System.out.println("Good Paris are "+count);
    }
}
