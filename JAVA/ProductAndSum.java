// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
import java.util.Scanner;
public class ProductAndSum {
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner scn = new Scanner(System.in);
        int inputNumber = scn.nextInt();
        int product =1;
        int sum=0;
        while(inputNumber >0){
            int remainder=inputNumber%10;
            product*=remainder;
            sum+=remainder;
            inputNumber=inputNumber/10;
        }
        if((product-sum)<0){
            System.out.println(-1*(product-sum));
        }else{
            System.out.println(product-sum);
        }
    }
}

