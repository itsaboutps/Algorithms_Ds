//https://leetcode.com/problems/build-array-from-permutation/
//1920. Build Array from Permutation
package LeetcodeProblems;

//https://leetcode.com/problems/build-array-from-permutation/
//1920. Build Array from Permutation
import java.util.Arrays;

public class BuildArrayFrmPermutation {
    public static void main(String[] args) {
        int []arr = {0,2,1,5,3,4};
        int arrNew[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrNew[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(arrNew));

    }
}
