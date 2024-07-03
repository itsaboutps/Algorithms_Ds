package LinkedList.Node;

// For classes /methods:

/** If you don't specify an access modifier for a class, it will have package-private access, which means it's accessible only within the same package.
*/


public class Node {
    // Data stored in the node
    public int val;


    // Pointer to the next
    // node in the list
    public Node next ;
    
    public Node() {}

    // Constructor with only data as
    // a parameter, sets next to null
    public Node(int val){
        this.val = val;
        this.next =null;
    }

    // Constructor with both data
    // and next node as parameters
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }


}
