// package LinkedList;
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

// import LinkedList.Node.Node;

// public class RemoveNthNode {
//     public static void main(String[] args) {

//         Node head1 = new Node(1);
//         head1.next = new Node(2);
//         head1.next.next = new Node(3);
//         head1.next.next.next = new Node(4);
//         head1.next.next.next.next = new Node(5);


//         int length = 0;
//         int numberOfNodeFromLast = 2;

//         Node temp1=  head1;

//         while(temp1!=null){
//             length++;
//             temp1 = temp1.next;
//         }
//         System.out.println("Number of nodes:: "+length);

//         int flen= length-numberOfNodeFromLast;

//         Node temp2 = head1;

//         for (int i = 0; i < flen-1; i++) {

//             temp2 = temp2.next;


            
//         }
//         temp2.next = temp2.next.next;

//         while(head1!=null){
//             System.out.println(head1.val);
//             head1= head1.next;

//         }

        
//     }
// }
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length =0;

        ListNode temp = head ;
        ListNode temp1 = head;

         ListNode dummy = new ListNode(0);
        dummy.next = head;

        //lets count the total nodes 
        while(temp!=null){
            length++;
            temp = temp.next;
        }

        int finallen = length-n;

        temp1 = dummy;

        for(int i =0;i<finallen;i++){

            temp1 = temp1.next;



        }
        temp1.next = temp1.next.next;

        return dummy.next;

        
    }
}