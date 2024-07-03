package LinkedList;

public class MiddleNode {
    public static void main(String[] args) {
        Node node1 = new Node(1); //! aka head node
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next =  node2;
        node2.next = node3;
        node3.next = node4;
    

        int len=0;
        Node temp =  node1;

        while(temp!=null){ 
            len++;
            temp=temp.next;
        }
        System.out.println("length of linked list=> "+len);
        System.out.println(len/2);
        Node temp1 = node1;
        while(len-- >0){
            temp1 = temp1.next;
        }
        System.out.println(temp1);
    }
    
}
