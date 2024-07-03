import java.util.Arrays;

class RotateArr{
    public static void main(String[] args) {
        int [][]arr={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        // Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]


        rotateImage(arr);
    }

    private static void rotateImage(int[][] arr) {
        int row =  arr.length;
        int column= arr[0].length;
        // *following the tranposing the matrix approach
        for (int i = 0; i< row; i++) {

            //*transposing the matrix works for perfect square  #Algorithm */
            //*we are traversing on dailogonal element that are present near diagonals
            for (int j = i; j < column; j++) {
                int temp  = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] =  arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp ;
                
            }
            
        }
        System.out.println(Arrays.deepToString(arr));
    }

}