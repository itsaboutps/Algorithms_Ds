package LinkedList;

import java.util.Stack;

import LinkedList.Node.Node;

public class ReverseLL {
    public static void main(String[] args) {
        // !creating a linked list manually

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        reverseLinksInPlace(head);


        reverseLinkedListUsingStack(head);

        
    }
    private static void reverseLinksInPlace(Node head) {

       //!                                    OO ==> OO ==> OO ==> OO
       Node temp = head;
       Node tempAdd = new Node();
       while(temp!=null){
        tempAdd = temp.next;
        head.next=null;

        
        
        head.next=null;

        head= head.next;
            
       }

        
    }
    public static void reverseLinkedListUsingStack(Node head){

        // Create a temporary pointer to
        // traverse the linked list
        Node temp = head;     

        //create a stack to temporarily store the value

        Stack<Integer> st = new Stack<>();

        //! step 1 pushing the values on to stack.
        while(temp!=null){
            st.push(temp.val);
            // System.out.println(temp.val);
            temp = temp.next;
        }
        // Reset the temporary pointer
         // to the head of the linked list
         temp = head; 

         //! step 2 pop the values from the stack 

         while(temp!=null){
            temp.val=st.pop();

            //* move to the next node */
            temp =  temp.next;
         }

         System.out.println(head.next);


    
}


}



