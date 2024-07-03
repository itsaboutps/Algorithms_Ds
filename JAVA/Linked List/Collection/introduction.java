// The Collection interface (java.util.Collection) and 
// Map interface (java.util.Map) are the two 
// main “root” interfaces of Java collection classes.

//*The utility package, (java.util) contains all the classes 
//*and interfaces that are required by the collection framework. 

// Java program to demonstrate 
// why collection framework was needed 
import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
// import java.util.*; 
import java.util.Vector;
  
class CollectionDemo { 
  
    public static void main(String[] args) 
    { 
        // Creating instances of the array, 
        // vector and hashtable 
        int arr[] = new int[] { 1, 2, 3, 4 }; 
        Vector<Integer> vec = new Vector(); 
        Hashtable<Integer, String> h = new Hashtable(); 

        /*
         * THESE ALL THREE IMPLEMENTS LIST INTERFACE
         */
        // List <T> al = new ArrayList<> (); 
        // List <T> ll = new LinkedList<> (); 
        
        Vector <Integer> v = new Vector<> (); 

        v.add(0);

        LinkedList<Integer> ll = new LinkedList<Integer>(); 

        ll.add(420);
        ll.add(300);
        // List <Integer> li = new LinkedList<> (); 

        System.out.println(ll);


        //!Where T is the type of the object 


        
        // Adding the elements into the 
        // vector 
        vec.addElement(1); 
        vec.addElement(2); 
  
        // Adding the element into the 
        // hashtable 
        h.put(1, "geeks"); 
        h.put(2, "4geeks"); 
  
        // Array instance creation requires [], 
        // while Vector and hastable require () 
        // Vector element insertion requires addElement(), 
        // but hashtable element insertion requires put() 
  
        // Accessing the first element of the 
        // array, vector and hashtable 

        List<String> arr1 = new ArrayList<String>(); 
        ArrayList<String> arr2 = new ArrayList<String>(); 


        List<String> stack = new Stack<String>(); 
        List<String> stackLO = new LinkedList<String>(); 

        Stack<String> stackes = new Stack<String>(); 
         CollectionDemo cd=new CollectionDemo();

        // stack.push("Geeks"); 
        // stack.push("For"); 
        // stack.push("Geeks"); 
        // stack.push("Geeks"); 
        stack.add("Geeks");
        stack.add("Prashant");


        System.out.println("stack "+stack);

        // Iterator for the stack 
        Iterator<String> itr = stack.iterator();
        // Printing the stack 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + itr.hasNext()+ " "); 
} 

        // System.out.println(arr[0]); 
        // System.out.println(vec.elementAt(0)); 
        // System.out.println(h.get(1)); 
  
        // Array elements are accessed using [], 
        // vector elements using elementAt() 
        // and hashtable elements using get() 
    } 
} 

/*
 * ! Method USED BY COLLECTION
Description

add(Object)	This method is used to add an object to the collection.
addAll(Collection c)	This method adds all the elements in the given collection to this collection.
clear()	This method removes all of the elements from this collection.
contains(Object o)	This method returns true if the collection contains the specified element.
containsAll(Collection c)	This method returns true if the collection contains all of the elements in the given collection.
equals(Object o)	This method compares the specified object with this collection for equality.
hashCode()	This method is used to return the hash code value for this collection.
isEmpty()	This method returns true if this collection contains no elements.
iterator()	This method returns an iterator over the elements in this collection.
max() 
 	This method is used to return the maximum value present in the collection.
parallelStream()	This method returns a parallel Stream with this collection as its source.
remove(Object o)	This method is used to remove the given object from the collection. If there are duplicate values, then this method removes the first occurrence of the object.
removeAll(Collection c)	This method is used to remove all the objects mentioned in the given collection from the collection.
removeIf(Predicate filter)	This method is used to remove all the elements of this collection that satisfy the given predicate.
retainAll(Collection c)	This method is used to retain only the elements in this collection that are contained in the specified collection.
size()	This method is used to return the number of elements in the collection.
spliterator()	This method is used to create a Spliterator over the elements in this collection.
stream()	This method is used to return a sequential Stream with this collection as its source.
toArray()	This method is used to return an array containing all of the elements in this collection.
 */


//!LIST INTERFACE

