package LinkedList.LearnLinkedList;

public class ReverseLL {

    public static void main(String[] args) {
        Node head = null; //local variable

        head = insert(head,2);
        head= insert(head,4);
        head = insert(head,5);

        print(head);


        head = reverse(head);
        print(head);        
    }

    static Node insert(Node head , int val){

        Node temp = new Node(val);
        temp.next = null;

        if(head ==null){
            head = temp;
        }
        else{
            Node temp1 = head;

            //traversing till the last
            while(temp1.next!=null){
                temp1 = temp1.next;
            } 

            //appending the node in the last after getting the addrress from last node above
            temp1.next =temp;
        }
        return head;


  
    }

    public static void print(Node head){

        while(head!=null){
            System.out.print( head.val + " ");

            head =head.next;

        }
        System.out.println();


    }

    public static Node reverse(Node head){
        Node current = head;
        Node next =null;
        Node prev= null;

        while(current!=null){

            next = current.next;
            current.next = prev;

            //here we are resetting our previous and current
            prev = current;
            current = next;


        }

        head = prev;
        return head;

    }
}
