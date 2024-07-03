// https://leetcode.com/problems/score-of-a-string/description/

package Strings;

import java.util.Scanner;

public class ScoreOfString {

    static void countString(String s){
        // System.out.println(s);
        for (int i = 1; i < s.length(); i++) {
            System.out.println(Math.abs((int)(s.charAt(i-1)) - (int)(s.charAt(i))));
            
        }


    }
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc =  new Scanner(System.in);
        String s1 = sc.next();
        countString(s1);
        
        
    }
}
