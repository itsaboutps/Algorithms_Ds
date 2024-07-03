package FunctionalProgramming;

import java.util.function.Function;

public class LambdaExp {
    public static void main(String[] args) {
        
        //but here it only works with one argument
        Function<Integer, Integer> absoluteValue =  (x)-> (x<0) ? -x : x;

        System.out.println(absoluteValue.apply(-5));
    }
    
}
