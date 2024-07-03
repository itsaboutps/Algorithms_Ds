package LinkedList;

public class CustomLinkedList {
    public static void main(String[] args) {
        // Integer []arr= {3,6,8,10};

        Node head = new Node(3);
        head.next = new Node(6);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);
        
        // System.out.println(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }


    
}


