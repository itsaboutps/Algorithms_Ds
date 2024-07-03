package Arrays;
// https://leetcode.com/problems/number-of-employees-who-met-the-target/
public class NumberOfEmployee {
    public static void main(String[] args) {
        int[] arr={1,3,4,1,4};
        System.out.println(new Solution().numberOfEmployeesWhoMetTarget(arr, 4));
    }
    
}


// !learnings forEach of java
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter =0 ;
        
        for(int c:hours){
            if(c>=target) counter++;
        }
        return counter;
        
    }
}