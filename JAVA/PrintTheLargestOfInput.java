// Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class PrintTheLargestOfInput {
    public static void main(String[] args) {
        int max=0;
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        while(number>0){
            if(number>max){
                max=number;
            }
            number= sc.nextInt();
            //apply the debugger here to see the catch here
            if (number==0){
                break;
            }
        }
        System.out.println("Largest number among the inputed number "+max);
    }
    }

