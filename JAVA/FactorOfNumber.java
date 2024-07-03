//Input a number and print all the factors of that number (use loops).
import java.util.Scanner;
public class FactorOfNumber {
    public static void main(String[] args) {
        System.out.println("Number of number to find its factors: ");
        Scanner scn = new Scanner(System.in);
        int inputNumber = scn.nextInt();        
        calculateFactors(inputNumber);
    }
    private static void calculateFactors(int number) {
        System.out.println("--------------------------------------- ");
        for(int i =1;i<Math.floor(number/2) +1;i++){
            if(number%i == 0){
                System.out.println(i);
            }
        }
        System.out.println(number);
    }
}
