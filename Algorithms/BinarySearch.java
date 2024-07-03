package Algorithms;


public class BinarySearch {
    public static void main(String[] args) {
        int [][]arr = {{-10,-9,-7,-7},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int maintainCount= 0;
        // *https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
        countNegativeNumbers(arr,maintainCount);
    }

    private static void countNegativeNumbers(int[][] arr,int maintainCount) {
        for (int i = 0; i < arr.length; i++) {
            // BinarySearching(maintainCount);
                        BinarySearching(arr[i],maintainCount);

            // System.out.println(Arrays.));


            
        }



    }
    public static void BinarySearching(int []arr,int maintainCount){
        int low = 0;
        int high = arr.length -1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]<0){
                // -10,-9,-7,-7
                // found {-10,-9,-7,-7,-6,-5}
                maintainCount = maintainCount + (high-mid)+1; 
                // mid = high;
                high =mid-1;              
            }
            else{
                low = mid+1;
            }

        }
        System.out.println(maintainCount);
        


    }
}
