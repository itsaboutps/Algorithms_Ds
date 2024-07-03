// Write a program to print whether a number is even or odd, also take input.
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scn = new Scanner(System.in);
        int inputNumber = scn.nextInt();
        //for String input : next() and nextLine()
        if(inputNumber % 2 == 0){
            System.out.println("Input number "+inputNumber+ " is EVEN");
        }
        else{
            System.out.println("Input number "+inputNumber+ " is ODD");
        }
    }
}
