import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its Armstrong: ");
        Scanner scn = new Scanner(System.in);
        int inputNumber = scn.nextInt();
        ArmstrongNumber obj =new ArmstrongNumber();
        obj.calculateArmstrong(inputNumber);
    }
    private void calculateArmstrong(int number){
        int countDigit=0;
        int calculateNumber=number;
        /*
          also below code can 
          be replaced by --->
          digit = (int)log10(num) + 1
          to find number of digits in a number;
         */
        while(number>0){
            int num=number/10;
            number=num;
            ++countDigit;
        }
        calculateSum(countDigit, calculateNumber);
    }

    private void calculateSum(int countDigit, int calculateNumber) {
        int sum=0;
        int compareNum=calculateNumber;
        while(calculateNumber>0){
            int remainder=calculateNumber%10;
            sum =(int)(sum + Math.pow(remainder,countDigit));
            calculateNumber=calculateNumber/10;
        }
        if(compareNum == sum){
            System.out.println("YES........!! "+compareNum+" is ArmstrongNumber");
        }else{
            System.out.println("No........!! "+compareNum+" is not ArmstrongNumber");
        }
    }
}



