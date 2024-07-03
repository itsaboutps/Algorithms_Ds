//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;

public class TakeInputUntilZero{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        while(number>0){
            sum+=number;
            number= sc.nextInt();


            //apply the debugger here to see the catch here
            if (number==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
