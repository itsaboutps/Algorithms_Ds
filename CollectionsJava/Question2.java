//! reverse the order of List

package CollectionsJava;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Question2 {
    public static void main(String[] args) {
        // System.out.println("hel");
        Integer [] array = {2,5,20,30,56};
        
        /**
         * Returns a fixed-size list backed by the specified array.
         * Changes made to the array will be visible in the returned list, 
         * and changes made to the list will be visible in the array.
         * The returned list is Serializable and implements RandomAccess.
         */
        List<Integer> li = Arrays.asList(array);

        // here we have created a list of Integer
        //! but remember it will modify the original | source array.
        Collections.reverse(li);
        System.out.println(li);
        

        // reverseOrderOfList()
    }
}
