public class MaximumNumberOfWords {
    public static void main(String[] args) {

    }
}

class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = Integer.MIN_VALUE;

        for(String sentence: sentences){
            String[] each = sentence.split(" ");

            if(each.length>maxLength){
                maxLength = each.length;


            }

            
        }
        return maxLength;
        
    }
}
