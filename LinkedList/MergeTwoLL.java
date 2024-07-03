// https://leetcode.com/problems/merge-two-sorted-lists/
package LinkedList;

import java.util.ArrayList;

import LinkedList.Node.Node;

public class MergeTwoLL {
    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        // list1.next.next.next = new Node(4);
        // list1.next.next.next.next = new Node(5);



        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);
        // list2.next.next.next = new Node(4);
        // list2.next.next.next.next = new Node(5);

        Node temp1 = list1;
        Node current1 = list1;
        Node current2= list2;
        Node temp2 = list2;
        int count1 = 0;
        int count2 = 0;

        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            count2++;
            temp2 = temp2.next;
        }

        ArrayList<Integer> arr = new ArrayList<>();


        Node temp3 =null;

        while(count2>count1){
            while(current1!=null){
                temp1.next = temp2;

                temp2 = temp2.next;

                current1 = current1.next;

            }

        }


        

    }
}
