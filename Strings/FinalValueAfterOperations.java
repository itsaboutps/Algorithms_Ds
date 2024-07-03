// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
package Strings;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        
        
    }
}


class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        
        //! learning is string contains operator and equals operator
/* 
        String myStr = "Hello";
System.out.println(myStr.contains("Hel"));   // true
System.out.println(myStr.contains("e"));     // true
System.out.println(myStr.contains("Hi"));    // false
*/


// ArrayList<Integer> ar = new ArrayList<>();
// ar.
        int finalMoney =0;
        for(String operation: operations){
            if(operation.contains("++")) finalMoney++;
            else finalMoney--;

        }

        return finalMoney;
        
    }
}