package Strings;

public class FirstPalindromeString {
    
}



class Solution {
    public String firstPalindrome(String[] words) {

        String palin="";
        for(String s:words){
            boolean isPalindrome = true;

            for(int i =0;i<s.length()/2;i++){                   
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    isPalindrome=false;
                    break;
                }
            }

            if(isPalindrome){
                return s;
            }

        }    
        return "";    
    }
}