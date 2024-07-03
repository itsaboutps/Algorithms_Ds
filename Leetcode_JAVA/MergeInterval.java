import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int [][]interval={{1,4},{2,3}};
        mergeInterval(interval);
        
    }

    private static void mergeInterval(int[][] interval) {
        ArrayList<int[]> arr = new ArrayList<>();
        // Arrays.sort(interval, (a, b) -> Integer.compare(a[0], b[0]));

        if(interval.length ==1){
            arr.add(interval[0]);
        }else{
            for (int i = 0; i < interval.length-1; i++) {

            if(interval[i][interval[i].length-1] - interval[i+1][0] >=0){

                int[] ar= {interval[i][0],interval[i+1][interval[i+1].length-1]};
                i=i+1;
                arr.add(ar);                
            }else{
                arr.add(interval[i]);
                arr.add(interval[i+1]);
            }          
        }
        }        
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
    
}
