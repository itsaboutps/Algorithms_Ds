package Strings;

public class CheckIfArrayEquivalent {
    public static void main(String[] args) {
        
    }
}

//! how to join the string and how to join the elements of array using String.join
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

return String.join("", word1).equals(String.join("", word2));




        
    }
}