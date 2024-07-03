//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package LeetcodeProblems;
import java.util.ArrayList;
import java.util.List;

public class GreatestNumberofCandies {
    public static void main(String[] args) {
        //take user input in your case..these are hard code values
        int []arr = {2,3,5,1,3};
        int largestElement=largestNumberInArray(arr);
        greatestNumberofCandies(arr,3,largestElement);
    }
    private static int largestNumberInArray(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    private static void greatestNumberofCandies(int[] arr, int extra,int largestElement) {
        List<Boolean> arrNew=new ArrayList<>(arr.length);

        for (int i=0;i<arr.length;i++) {
            if((arr[i]+extra)>=largestElement){
                arrNew.add(true);
            }
            else{
                arrNew.add(false);
            }
        }
        System.out.print(arrNew);
    }
}
//git commit --date="10 day ago" -m "Your commit message" 

