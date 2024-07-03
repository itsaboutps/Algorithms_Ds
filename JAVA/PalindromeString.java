//To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        System.out.println("Input a string to check if is Palindrome: ");
        Scanner scn = new Scanner(System.in);
        String inputString = scn.next();
        PalindromeString palin = new PalindromeString();
        
        if(palin.isPalindrome(inputString)){
            System.out.println(inputString +" is a Palindrome String");
        }else{
            System.out.println(inputString +" is NOT Palindrome String");
        }
    }
    //Cannot make a static reference to the non-static method fxn(int) from the type Two [duplicate]
    //https://stackoverflow.com/questions/11491750/cannot-make-a-static-reference-to-the-non-static-method-fxnint-from-the-type-t

    private boolean isPalindrome(String inputString) {
        boolean flag=false;
        for(int i=0,j=inputString.length()-1;i<inputString.length();i++,j--){
            if(inputString.charAt(j) != inputString.charAt(i)){
                flag= false;
                return flag;
            }
        }
        return true;    
    }
}