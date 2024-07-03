package LinkedList;

//! Definition of single linked list
public class Node {
    int val;
    Node next;
    //non parametrized contrustor
    Node(){}
    //parameterized constructors
    Node(int val){
        this.val=val;
    }
    Node(int val, Node next){
        this.val=val;
        this.next= next;
    }
    
}
