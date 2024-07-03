package LinkedList;

import LinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println("Hello");

        Node node1 = new Node(1); //! aka head node
        Node node2 = new Node(2);
        Node node3 = new Node(3);


        node1.next = node2;
        node2.next = node3;
        reverseLL(node1);
    }

    private static void reverseLL(Node head) {
        //!    node1 ==> node2 ===> node3
        //!    node3 ==> node2 ===> node1

        Node prev = null;
        Node current = head;
        while(current!=null){
            Node nextNode = current.next;
            current.next = prev;
            prev =  current;
            current  = nextNode;
        }
        // return prev;




    }
}
