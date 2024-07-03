// https://leetcode.com/problems/split-a-string-in-balanced-strings/

package Strings;

public class BalancedString {
    public static void main(String[] args) {
        
    }
}


class Solution {
    public int balancedStringSplit(String s) {
        int counter = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                counter++;
            }
        }
        return counter;
    }
}

