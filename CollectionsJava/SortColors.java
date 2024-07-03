package CollectionsJava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortColors {
    public static void main(String[] args) {
        int []arr = {2,0,2,1,1,0};

        int [] newArr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
        
        
    }
}
