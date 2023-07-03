package Basic_Language.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListCollection {   
    public static void main(String[] args) {
        arrayList();
        linkedList();
        vectors();
        stacks();
    }


    /**
     * rememeber 
     *! public class ArrayList<E> extends AbstractList<E>
     *!  implements List<E>, RandomAccess, Cloneable, java.io.Serializable
     */
    /**
     * so as we can see that arraylist implements RandomAccess so fetching elements 
     * from array list requires O(1) constant time.
     * So it is advisable to use array list if requirement is mainly fetching of data
     * As it can do in constant time
     */

     /**
      * retrieving elements by index would be less efficient. 
      * In such cases, the get() operation would require traversing the 
      * elements one by one from the beginning of the list until the desired index is reached. 
      * This process takes linear time, i.e., O(n), where n is the number of elements in the list.
      */
      /**
       * !ArrayList is worst choice if our frequent operation is insertion or deletion in middle.
       */

      /**
       * remember DS that implements Random Access is best suitable for fetching or getting data
       */
        /**
        *  However, it's important to note that if your application involves frequent 
        * insertions or removals from the middle of the list, other data structures 
        * like LinkedList might be more suitable, as they offer efficient insertion 
        * and removal operations at arbitrary positions. 
        */
        /**
         * to convert into synchronisation ==> use List l1 = Collections.SynchronizedList(l);
         */
    private static void arrayList() {
        ArrayList ar= new ArrayList<>();
        ar.add("ABC");
        ar.add("BCP");
        ar.add(1);
        System.out.println("ar"+ar);
    }

    /**
     *  LinkedList implements serilizable and clonable interfaces 
     *  but not randomAccess interface
     */
      private static void linkedList() {
        LinkedList l = new LinkedList();
        l.add("Durga");
        l.add(30);
        l.add(null);
        l.add("Durga");
        l.set(0, "Software");
        l.set(0, "Venky");
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);
    }

    public static void vectors(){
        Vector vc = new Vector();
        vc.add("Vector");
        System.out.println("Vectors == > "+vc);

    }

    public static void stacks(){
        Stack sc = new Stack();
        sc.push("stack1");
        sc.push("stack2");
        sc.push("stack3");
        System.out.println("stacks==> "+sc);
    }
    
}
