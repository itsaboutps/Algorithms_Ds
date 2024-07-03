package Array;

public class Arrays {
    public static void main(String[] args) {

        // datatype[] variable_name =  new datatype[size]
        int [] arr = new int[5];
        //! int [] arr ; declaration of array. arr is getting defined in stack ----> its a reference variable
        //! new int[5] initialization actually object is created in the memory head.


        /**
         ** The things which are on left side of equals are stored in stack memory so declareation is happened 
         *  at COMPILE TIME AS IT IS ON LEFT SIDE OF EQUALS(int [] arr).
         ** Things which are on right side of equals are stored in heap memory and it happens at RUNTIME AKA DYANMIC MEMORY ALLOCATION
         ** WHAT IS DYNAMIC MEMORY ALLOCAITON?
         ** It means assigning the memory space at the runtime or execution time.
         
In Java, objects are dynamically allocated in an area of memory known as the heap. The heap is a region of memory where objects are created and managed by the Java Virtual Machine (JVM). References to these objects are stored in variables, and these variables can be stored on the stack.

Let's break down how this works step by step:

Stack and Heap: In Java, memory is divided into two main regions: the stack and the heap.
The stack is used for storing local variables, method call information, and control flow data.
Each thread has its own stack. The heap is used for storing objects that have a longer lifespan
and need to be dynamically allocated and managed.

Reference Variables: A reference variable is a variable that holds the memory address (reference) of
an object stored in the heap. It does not directly store the object itself,
but rather points to the memory location where the object is located.

Object Creation: When you create a new object using the new keyword,
the JVM dynamically allocates memory for that object on the heap.
This memory allocation includes space for the object's data members (instance variables) 
and any additional metadata required by the JVM for bookkeeping.

Assigning Reference: When you create an object, you're given a reference to it.
 You can think of this reference as a memory address where the object resides in the heap.
  This reference is stored in a variable, and this variable can be on the stack.

MyClass obj = new MyClass(); // 'obj' is a reference variable
Here, obj is a reference variable that holds the memory address of the newly created MyClass object in the heap.

Accessing Object Data: To access the data members (fields) or methods of the object,
 you use the reference variable. The JVM uses the reference to locate the actual object in the heap 
 and perform operations on it.

Object Lifespan: The reference variable can go out of scope (e.g., when a method ends),
 but as long as there is a valid reference to the object (either directly or indirectly),
  the object itself remains in the heap and is not eligible for garbage collection.


         * 
         * 
         * 
         */

    }
}
