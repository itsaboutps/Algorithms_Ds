import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeSortedArr{
    public static void main(String[] args) {
       int[] nums1 = {4,5,6,0,0,0};
       int m = 3;
       int[] nums2 = {1,2,3};
       int n = 3;
       //brute force approach
    //    mergeSortedArr(nums1,m,nums2,n);
       //approach 1
       mergeSortedArray(nums1, m, nums2, n);

    }

    //approach 1
    private static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

        int i =m -1;
        int j =n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && (nums1[i]>nums2[j])){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
        
    }

    //Brute force approach
    private static void mergeSortedArr(int[] nums1, int m, int[] nums2, int n) {
        int temp =0;
        //complexity-->
        //O(m+n)log(m+n)
        for (int i = m; i < nums1.length; i++) {
            nums1[i]=nums2[temp];
            temp=temp+1;
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
        
        // List<int> arr= Arrays.asList(nums1);
        Arrays.sort(nums1);
        


    
    }

}