// https://leetcode.com/problems/find-words-containing-character/

package Strings;

import java.util.ArrayList;
import java.util.List;

public class FinalWordsContainingChar {
    public static void main(String[] args) {
        
    }
}
//! In terms of performance, indexOf() may be slightly faster than contains() because it stops searching as soon as it finds the first occurrence of the substring, while contains() may need to search the entire string.


class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<words.length;i++){
            if(words[i].indexOf(x)>-1) arr.add(i);

        }
        return arr;
        
    }
}