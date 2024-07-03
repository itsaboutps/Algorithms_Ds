import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//!https://leetcode.com/problems/sort-colors/

//!Yes for Binary search the time complexity in Log(n) not nlog(n).
//!So it will be less than O(n). But N*Log(N) is greater than O(N).
public class SortColors {
    public static void main(String[] args) {
        int [] arr={2,0,2,1,1,0,0};
        //!brute force apporach
        // approach 1
        // sortColors(arr);
        //!kind of more improversed approach
        // approach 2 --> 2n time complexity
        sortingColors(arr);
        //!kind of more optimal approach
        //! #1 Algorithm Dutch National Flag
        sortingColor(arr);

    }
    
    private static void sortingColor(int[] arr) {
        int low =0;
        int mid=0;
        int high=arr.length;
        while(mid<=high){
            if (arr[mid]==0) {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if(arr[mid] == 1) {
                mid++;
                
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;

            }

        }
        // private swap(mid, high);
    }

    // private void swap(int i, int j) {
    // }

    private static void sortingColors(int[] arr) {
        int cnt0=0,cnt1=0,cnt2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                cnt0++;
            }else if(arr[i]==1){
                cnt1++;
            }else{
                cnt2++;
            }
            
        }
        for (int i = 0; i < cnt0; i++) {
            arr[i]=0;
        }
        for (int i = cnt0; i < cnt0+cnt1; i++) {
            arr[i]=1;
        }
        for (int i = cnt0+cnt1; i < arr.length; i++) {
            arr[i]=2;
        }
    }

    //approach 1
    public static void sortColors(int []arr) {
        int temp = 0;    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] >arr[j]) {      //swap elements if not in order
                    temp = arr[i];    
                    arr[i] = arr[j];    
                    arr[j] = temp;    
                  }  
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
