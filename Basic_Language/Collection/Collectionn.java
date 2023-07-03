package Basic_Language.Collection;

import java.util.*;

public class Collectionn {
    public static void main(String[] args) {
//        arrayLists();
//        linkedlists();
//        stack();
        iterator();
        System.out.println("Hello");
    }
    public static void iterator(){
        LinkedList l = new LinkedList();
        l.add("balakrishna");
        l.add("venki");
        l.add("chiru");
        l.add("nag");
        System.out.println(l);
        ListIterator ltr = l.listIterator();
        while (ltr.hasNext()){
            String s = (String) ltr.next();

            if (s.equals("venki")){
                ltr.remove();//[balakrishna, chiru, nag]
            } else if (s.equals("nag")){
                ltr.add("chaintu");//[balakrishna, chiru, nag, chitu]
            } else if (s.equals("chiru")){
                ltr.set("charan");//[balakrishna, charan, nag, chitu]
            }
        }
        System.out.println(l);//[balakrishna, charan, nag, chitu]
    }

    private static void stack() {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s); //[A,B,C]
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
    }

    /*
    * If we want to represent a group of individual objects as a single
    * entity then we should go for collection.
    * Collection interface defines the most common methods which are
    * applicable for any collection objects.
    * */
    /*
    * 	Collection(I)(1.2v)
					     |
					     |
					     |
					     |
					    List(I)(1.2V)
		------------------------------------------------------
		|			     |			     |
		|			     |			     |
		|			     |			     |
		|			     |			     |
	     ArrayList(1.2V)		LinkedList(1.2V)	   Vector (1.0V)
	     							     |
	     							     |
	     							     | Legacy classes
	     							     |
	     							   stack
    * */

    /**
     * ArrayList is the best choice if our frequent operation is retrival operation(because ArrayList implements RandomAccess interface).
     * ArrayList is worst choice if our frequent operation is insertion or deletion in middle.
     */
    private static void arrayLists() {
        ArrayList list = new ArrayList<>(); //non synchronised
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>()); // synchronised but at some cost of locking and releasing the lock

        System.out.println(list.size());
        /**
         * It's also worth mentioning that synchronized wrappers come with a performance cost due
         * to the overhead of acquiring and releasing the lock. In scenarios where you don't require
         * concurrent modification of the data structure,
         * using non-synchronized versions can offer better performance in single-threaded environments.
         */

        list.add("A");
        list.add(10);
        list.add("A");
        list.add(null);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2, "M");
        list.add("N");

        System.out.println("List ======>"+list);

    }

    public static void linkedlists(){

        //creates empty linked list object
        LinkedList lk = new LinkedList();

        //Creates an equivalant LinkedList object for the given collection.
        List<String> collection = new ArrayList<>();
        collection.add("element1");
        collection.add("element2");
        collection.add("element3");
        System.out.println("List ===> "+collection);
        LinkedList lk1 = new LinkedList(collection);
        System.out.println("Collection ===> "+lk1);
        moreExamples();
    }

    private static void moreExamples() {
        LinkedList l = new LinkedList();
        l.add("Durga");
        l.add(30);
        l.add(null);
        l.add("Durga");
        l.set(0, "Software");
        l.set(0, "Venky");
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);
    }
}
