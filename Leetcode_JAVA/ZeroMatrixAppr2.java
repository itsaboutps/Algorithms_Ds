import java.util.Arrays;

public class ZeroMatrixAppr2 {
    public static void main(String[] args) {
        int arr[][]={{0,1,2,0},
                     {3,4,5,2},
                     {1,3,1,5}};
        System.out.println(Arrays.deepToString(arr));
        /**
         * []
         * []
         * []
         */

        // [] [] [] [];

        int row = arr.length;
        int column =  arr[0].length;

        int[] rowArr = new int [row];
        int[] colArr  = new int [column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j] == 0){

                    // mark ith index of row wih 1:                    // mark jth index of col wih 1:

                    rowArr[i]  = 1;
                    colArr[j]  = 1;
                
                }

                
            }
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if((rowArr[i] ==1) || colArr[j] ==1){
                    arr[i][j] = 0;
                }
                
            }
            
        }

     System.out.println(Arrays.deepToString(arr));

    }
     
}
