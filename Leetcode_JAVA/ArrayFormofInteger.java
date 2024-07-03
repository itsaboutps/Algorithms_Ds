package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ArrayFormofInteger {
    public static void main(String[] args) {
        int []arr={1,2,9};
        // [9,9,9,9,9,9,9,9,9,9]
        int k=1;
        arrayFormInt(arr,k);
    }

    private static void arrayFormInt(int[] arr, int k) {
        // int sum=k;
        List<Integer> array = new ArrayList<Integer>();

        long sum=k;
        for (int i = 0,j=arr.length-1; j>=0; j--) {
            // sum+=arr[j]*Math.pow(10, j--);

            sum+=arr[j];
            int carry=sum;
            

            System.out.println("Print"+sum);
        }
        // sum=sum+k;
        System.out.println(sum);

    }
}
