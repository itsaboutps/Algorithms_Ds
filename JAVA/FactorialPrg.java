// Factorial Program In Java
import java.util.Scanner;

public class FactorialPrg {
    public static void main(String[] args) {
        System.out.println("Enter the number to find its factorial");
        Scanner scn = new Scanner(System.in);
        int inputNumber = scn.nextInt(); 
        int fact=1;
        
        if(inputNumber == 0){
            System.out.print("factorial of number is "+1);
        }
        else{
        while(inputNumber>0){
            fact*=inputNumber;
            inputNumber--;
        }
        System.out.println("factorial of number is "+fact);
    }
    }
}
