package Basic_Language.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        //! Map is not child interface of collection.

        //If we want to represent a group of objects as key-value 
        //pairs then we should go for Map.
        hashMaps();
        linkedHashMap();
        //! there is also IdentityHashMap
    }

    //It is the child class of HashMap
    //insertion order is preserved.
    private static void linkedHashMap() {
        LinkedHashMap m = new LinkedHashMap();
        m.put("chiranjeevi", 700);
        m.put("balaiah", 800);
        m.put("venkatesh", 200);
        m.put("nagarjuna", 500);
        System.out.println("LinkedHashMap === > "+m);
    }

    private static void hashMaps() {
        HashMap m = new HashMap();
        m.put("chiranjeevi", 700);
        m.put("balaiah", 800);
        m.put("venkatesh", 200);
        m.put("nagarjuna", 500);
        System.out.println(m);
        //below will return the old value
        System.out.println("**"+m.put("chiranjeevi", 1000));
        Set s = m.keySet();
        System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s1 = m.entrySet();
        System.out.println(s1);
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + "------" + m1.getValue());
            if (m1.getKey().equals("nagarjuna")){
                m1.setValue(10000);
            }
        }
        System.out.println(m);
    }
    
}
