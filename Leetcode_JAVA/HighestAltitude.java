// https://leetcode.com/problems/find-the-highest-altitude/submissions/
package LeetcodeProblems;
//discussed two approaches here
import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int []arr={52,-91,72};
        // approachOne(arr);
        approachTwo(arr);
    }

    private static void approachTwo(int[] gain) {
        int max = 0;  
        int sum = 0;
        for(int i=0;i<gain.length;i++){
            sum = sum + gain[i];
            if(sum>max)
                max=sum;
        }
        // return max;
        System.out.println(max);
    }
    

    // private static void approachOne(int[] gain) {
    //     int max=0;
    //     for(int i=1;i<gain.length;i++){
    //         gain[i]=gain[i]+gain[i-1];
    //     }
    //     System.out.println(Arrays.toString(gain));
    //     largestNumberInArray(gain);
    // }
    // private static void largestNumberInArray(int[] arr) {
    //     int max=arr[0];
    //     for(int i=0;i<arr.length;i++){
    //     if(arr[i]>max){
    //         max=arr[i];
    //     }
    // }
    //     System.out.print(max);
    // }

    
}
