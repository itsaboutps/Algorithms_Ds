package FunctionalProgramming;
// import java.util.function.BiFunction;

import FunctionalProgramming.TriFunction;
import FunctionalProgramming.NoArgFunction;

public class BiFunction {
    public static void main(String[] args) {

        //here it is different from lambda fucntion as it has two argument and return also
        
        // BiFunction<Integer,Integer,Integer> add = (x,y)->x+y;

        // System.out.println(add.apply(23,44));

        TriFunction<Integer,Integer,Integer,Integer> addThree = 
        (x,y,z )-> x+y+z;

        System.out.println(addThree.apply(4, 5, 6));

        NoArgFunction<String> sayHello =  () -> "hello!";
        System.out.println(sayHello.apply());


    }
}
