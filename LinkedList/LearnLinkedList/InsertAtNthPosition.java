package LinkedList.LearnLinkedList;

public class InsertAtNthPosition {
    static Node head;

    public static void main(String[] args) {

        head= null; //Empty list
        insert(2, 1); //List: 2
        insert(3,2); //List: 2 3
        insert(4,1); //List: 4, 2, 3
        insert(5,2); //List: 4,5,2,3
        print();
        
    }


    static void insert(int val, int pos){

        Node temp1 =   new Node(val);
        temp1.next = null;

        //! insert at FIRST POSITION
        if(pos==1){
            temp1.next =head;
            head = temp1;
            return;
        }

        Node temp2 = head;

        for (int i = 0; i < pos-2; i++) {
            temp2=temp2.next;
        }

        // linking the newely created node
        // to the location we have traversed above

        temp1.next=temp2.next; 
        temp2.next = temp1;



    }

    static void print(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }



    }
}


class Node {
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
