import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Number of fibonacci number: ");
        Scanner scn = new Scanner(System.in);
        int inputNumber = scn.nextInt();
        calculateFibonacci(inputNumber);
    }

    private static void calculateFibonacci(int inputNumber) {
        int firstNo = 0 , secondNo = 1;
        System.out.print(firstNo + " ");
        System.out.print(secondNo + " ");

        while(inputNumber-2 >0){
            int thirdNo=firstNo+secondNo;
            System.out.print(firstNo+secondNo + " ");
            firstNo=secondNo;
            secondNo=thirdNo;
            inputNumber --;
        }
    }
}
