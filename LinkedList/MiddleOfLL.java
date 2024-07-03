// https://leetcode.com/problems/middle-of-the-linked-list/
package LinkedList;

import LinkedList.Node.Node;

public class MiddleOfLL {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


        int count =0 ;
        Node temp = head ;
        while(temp!=null){
            temp= temp.next;
            count++;
        }

        System.out.println(count);

        if(count%2==0){

            Node temp1 = head;

            for(int i =0;i<count/2;i++){

                temp1=temp1.next;



            }
            System.out.println(temp1);

            // while()

        }else{

            Node temp3= head;

            for (int i = 0; i < Math.ceil((count)/2); i++) {
                temp3 = temp3.next;
                
            }

            System.out.println(temp3.val);

        }
    }
}
