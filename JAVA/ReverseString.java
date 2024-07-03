// Reverse A String In Java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String inp=sc.nextLine();
        ReverseString rev=new ReverseString();
        rev.revString(inp);
    }
    private void revString(String inps1){
        for (int i=inps1.length()-1;i>=0;i--) {
            System.out.print(inps1.charAt(i));
        }

    }
}
