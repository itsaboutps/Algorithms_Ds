package LinkedList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLL_UsingCollectionOrIterator {
    public static void main(String[] args) {
        System.out.println("hello");
        Integer []arr= {3,6,8,10};
        IntetrateLinkedList(arr);
    }

    private static void IntetrateLinkedList(Integer[] arr) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addAll(Arrays.asList(arr));

        //procedure 1
        for(Integer i : ll){
            System.out.println(i);

        }
        //procedure 2
        Collections.reverse(ll);
        Iterator it =  ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
