package CollectionsJava;
// average of the numbers in the list

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> source =  Arrays.asList(2,5,20,30,56);

        System.out.println(calcAverage(source));
        
    }
    // public static void int main(String[] args) {

    private static int calcAverage(List<Integer> source) {
        if(source==null || source.isEmpty()){

            return 0;
        }else{

            //! reduce : first param is starting sum | second param is binary operation.
            System.out.println(source.stream().reduce(2,(a,b) -> a+b));
            return source.stream().reduce(0,(a,b) -> a+b)/source.size();
                   // source.stream().reduce(0,Integer::sum);


            //* 0 is the starting value of reduce */
            //* The second argument (a, b) -> a + b is a lambda expression representing a binary operator. 
            
        }
    }
    
}
