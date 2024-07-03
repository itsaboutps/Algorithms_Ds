package Basic_Language.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        /**
           Collection(I)(1.2v)
				     |
				     |
				     |
				     |
				    Set(I)(1.2V)-----------------|
				     |			                 |
				     |				             |
	                 |				     SortedSet(I)
				     |				             |(1.2v)
     				HashSet(1.2V)	   		     |
     				     |				         |
     				     |			      NevigableSet(I)
     				     |				         |(1.6v)
     				     |				         |
     			      LinkedHashSet(1.4V)		TreeSet(1.2v)
         
                      */
        hashSets();
        linkedHashSets();
        sortedSets();

    }

    /**
     * helps in interconversion of collection objects
     * HashSet h = new HashSet(Collection c)
     */
    //! underlying ds is HashTable.
    private static void hashSets() {
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));//! False
        //! Insertion order is not preserved in HashSet
        System.out.println("HASH_SETS====> "+h);
        //! HASH_SETS====> [null, B, C, D, Z, 10]

        

    }

    //! It is child class of HashSet
    //! It is exactly same as HashSet(including constructors and methods) except the following differences
    //! underlying ds is LinkedList and HashTable.
    private static void linkedHashSets(){
//* In general we can use LinkedHashSet to develop cache based applications where duplicates are not allowed and insertion order preserved. */
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("Z");
        lhs.add(null);
        lhs.add(10);
        System.out.println("LINKED_HASH_SETS====> "+lhs);
        //!     LINKED_HASH_SETS====> [B, C, D, Z, null, 10]
    }

    //! 		Collection(I)--------->Set(I)------------>SortedSet(I)

    /**SortedSet is child interface of set. If we want to represent a group of individual 
    objects according to some sorting order without duplicates then we should go for SortedSet.*/


    /**
     * ! It restricts dublicate entry
     * ! It maintains sorting in ascending order
     * ! Treesert uses balanced tree data structure underneath it.
     * ! TreeSet implements Serilizable and Clonable but not RandomAccess interface.
     */
    private static void sortedSets(){
        SortedSet ts = new TreeSet<>();
        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
  
        // Adding the duplicate
        // element
        ts.add("India");
        // ts.add(null);
        //! hetrogenours object insertion not allowed will give runtime exception
        //! saying ClassCastException
        // ts.add(1);
        System.out.println("SORTED SET ==> "+ts);
    }

    
}
