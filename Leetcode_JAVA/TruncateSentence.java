// 1816. Truncate Sentence
// https://leetcode.com/problems/truncate-sentence/
package LeetcodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class TruncateSentence {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=in.nextLine();
        System.out.println("Enter the number");
        int i=in.nextInt();
        TruncateSentence sentence=new TruncateSentence();
        // System.out.print(sentence.truncateSentence(s, i));
        sentence.truncateSentenceUsingSplit(s, i);

    }
    //Approch 1:[using split]
    public void truncateSentenceUsingSplit(String s,int i){
        String s1[]=s.split(" ");
        String truncatedString="";
        int j=0;
        while(i>j){
            truncatedString+=s1[j];
            truncatedString+=" ";
            j++;
        }
        System.out.print(truncatedString.trim());
    }
}
