package Strings;

import java.util.HashMap;
import java.util.Map;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        Map<Character,Integer> mp = new HashMap<>();

        for(char c ='a';c<='z';c++){
                mp.put(c, null);
                
        }

        for(int i =0;i<sentence.length();i++){
            mp.remove(sentence.charAt(i));
        }

        System.out.println(mp.isEmpty());



        // System.out.println(mp);
    }
   
}
class Solution {
    public boolean checkIfPangram(String sentence) {

        Map<Character,Integer> mp = new HashMap<>();

        for(char c ='a';c<='z';c++){
                mp.put(c, null);
                
        }

        for(int i =0;i<sentence.length();i++){
            mp.remove(sentence.charAt(i));
        }

        return mp.isEmpty();
        
    }
}


class Solution1 {
    public boolean checkIfPangram(String sentence) {
        char ch='a';
        for(int i=0; i < 26; i++)
            if(sentence.contains(String.valueOf(ch))) ch++;
            else return false;
        return true;
    }
}