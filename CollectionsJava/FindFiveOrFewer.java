package CollectionsJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFiveOrFewer {
    public static void main(String[] args) {
        String source = "there are both smaller and bigger words here";

        // so basic point is you cannot print the array but you can print list directly 
        System.out.println(implement(source));


        
    }
    public static List<String> implement(String source){
                return Arrays.stream(source.split(" ")).filter(el -> el.length()<=5).collect(Collectors.toList());

        
    }
    
}
