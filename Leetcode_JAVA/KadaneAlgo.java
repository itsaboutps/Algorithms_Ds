public class KadaneAlgo {
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        //Brute Force 
        //!  O(n^2)
        maximumSubArr(arr);
        // #Algorithm 2 - Kadane's ALgorithm
        //!  O(n)
        maximumSum(arr);
    }
    /**
     * here we are going to decide while traversing only once that we have to make 
     * new sum var or continue with the older sum 
     * @param arr
     */
    private static void maximumSum(int[] arr) {
        // int max_sum=arr[0];
        // int curr_sum=arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     curr_sum+=arr[i];
        //     if( curr_sum>max_sum){
        //         max_sum=curr_sum;
        //     }
        // }
        //!same thing below but more optimised
        int max_sum=arr[0];
        int curr_sum=max_sum;
        for (int i = 1; i < arr.length; i++) {
            curr_sum = Math.max(arr[i]+curr_sum, arr[i]);
            max_sum= Math.max(max_sum, curr_sum);   
        }
        // return max_sum;



    }
    public static void maximumSubArr(int []arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
             sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
            if(sum>=max){
                max=sum;
            }
            }
        }
    }

    
}
