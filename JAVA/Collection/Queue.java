package Basic_Language.Collection;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        //it is child interface of collection.
        //LinkedList class also implements Queue interface.
        //LinkedList based implementation of Queue always follows FirstInFirstOut order.
        PriorityQueue q = new PriorityQueue();
        System.out.println(q.peek());//null
//        System.out.println(q.element());//RE:NSEE
        for (int i = 0; i <= 10; i++){
            q.offer(i);
        }
        System.out.println(q);//[0,1,2,3,4...10]
        System.out.println(q.poll());//0
        System.out.println(q);//[1,2,3,4...10]

    }
}
