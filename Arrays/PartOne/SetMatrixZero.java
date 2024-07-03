package Arrays.PartOne;

/**
 * SetMatrixZero
 */
public class SetMatrixZero {

    public static void main(String[] args) {

        // int [][]matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int [][]matrix = {{0,1}};
        // int [][]matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};



        int row = matrix.length;
        int column = matrix[0].length;
        
        // traverse the array -> iterate through row and then column 
        
        bruteForceApproach(matrix, row, column); //n^3 time complexity
        betterApproach(matrix,row,column);
        optimalApproach(matrix,row,column);
        
    }

    private static void optimalApproach(int[][] matrix, int row, int column) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'optimalApproach'");
    }

    private static void betterApproach(int[][] matrix, int row, int column) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'betterApproach'");
    }

    private static void bruteForceApproach(int[][] matrix, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                // System.out.print(matrix[i][j] + " ");
                if(matrix[i][j] == 0){

                   //mark all row as -1 except that cell
                   //mark all colum as -1 except that cell
                //    markRows(i);
                //    markColumn(j);
                for(int k=0;k<row;k++){
                    if(matrix[k][j] !=0){
                        matrix[k][j] = -1;
                    }
                }
                for (int j2 = 0; j2 < column; j2++) {
                    if(matrix[i][j2]!=0){
                        matrix[i][j2]= -1;
                    }
                    
                }

                }
                
            }
            // System.out.println();
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j]<0){
                    matrix[i][j] = 0;
                }
                
            }
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]);
                
            }
            System.out.println();
            
        }
    }
}