package LeetcodeProblems;

public class MaximumSubarrray {
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        maximumSubarray(arr);
    }

    private static void maximumSubarray(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            //  max=arr[i];
            int sum=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum+=arr[j];



                
            }
            if(max<sum){
                max=sum;
            }

        }
        System.out.println(max);
    }
}
