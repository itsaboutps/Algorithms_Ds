package LinkedList.LearnLinkedList;

import java.util.Scanner;

public class DeleteNode {
    private static Node head = null;


    public static void main(String[] args) {

        insert(2);
        insert(3);
        insert(4);

        print();
        System.out.println("Enter a positive number :: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        delete(n);
        print();

        
    }

    //delete a position n;
    private static void delete(int n) {
        Node temp1 = head;

        if(n==1){
            head = temp1.next;
            return;
        }

        for (int i = 0; i < n-2; i++) {
            temp1 = temp1.next;
            //temp 1 points to (n-1)th node

            
        }
        
        Node temp2 = temp1.next; //nth node

        temp1.next = temp2.next;
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


