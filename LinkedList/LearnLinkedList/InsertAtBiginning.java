package LinkedList.LearnLinkedList;

import java.util.Scanner;

public class InsertAtBiginning {
    static Node head = null;

    public static void main(String[] args) {

        System.out.println("How many number are there ? ");


        Scanner n = new Scanner(System.in);

        int number = n.nextInt();

        for (int i = 0; i < number; i++) {

            System.out.print("Enter the number:: ");
            int nums = new Scanner(System.in).nextInt();

            insert(nums);
            print();
            
        }




        

        // Node head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);



        // Node newNode = new Node(77);
        // newNode.next=head;

        // Node temp = newNode;

        // while (temp!=null) {

        //     System.out.println(temp.val);
        //     temp=temp.next;
            
        // }


        
    }
    static void insert(int val){


        //! when the LL is empty
        Node temp = new Node(val);
        temp.next =  head;
        head = temp;




    }
    static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();

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
