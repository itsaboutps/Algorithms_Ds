// https://leetcode.com/problems/reverse-prefix-of-word/

package Strings;

public class ReversePrefixOfWord {

}
class Solution {
    public String reversePrefix(String word, char ch) {
        int captureIdx = -1;

        char[] charArr = word.toCharArray();

        for(int i =0;i<charArr.length;i++){

            if(charArr[i] == ch){
                captureIdx=i;
                break;
            }
        }

        if(captureIdx== -1){
            return word;
        }

        for(int i =0;i<=captureIdx/2;i++){
            char temp = charArr[i];
            charArr[i] = charArr[captureIdx-i];
            charArr[captureIdx-i] = temp;
        }

        return new String(charArr);
        
    }
}