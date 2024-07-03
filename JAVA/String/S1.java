package Basic_Language.String;

public class S1 {
    public static void main(String[] args) {
        immutableProp(); 
        alternateWayToString();
    }

    private static void alternateWayToString() {
        //!both create mutable string
        StringBuffer sb = new StringBuffer("Priyanshu");
        StringBuilder mutableString = new StringBuilder("Hello");
        sb.append(" Singh");
        System.out.println(sb);
    }

    private static void immutableProp() {
        String s =  new String("Prashant");
        s=s.concat(" singh");
        s.substring(0,2);
        s.trim();
        System.out.println(s);

        if ("Prashant".equals(s)) {
            System.out.println("Same object");
        } else {
            System.out.println("New object created");
        }
    }
    // == or equals check if memory address are same
        
}
/**
 * in the case of StringBuffer, it is designed to be thread-safe. It achieves thread safety by using synchronized methods, which means that only one thread can access the StringBuffer object at a time. When a method of StringBuffer is called, the object locks itself to ensure that no other thread can access it until the method completes. This synchronization prevents race conditions and guarantees that the StringBuffer object's internal state remains consistent.

On the other hand, StringBuilder is not thread-safe. It does not include any synchronization mechanisms. Therefore, if multiple threads access and modify a StringBuilder object concurrently, it can lead to unpredictable behavior and data corruption.
 */

//  !When choosing between StringBuilder and StringBuffer, consider the concurrency requirements of your application. If you are working in a multi-threaded environment where multiple threads may access and modify the same string object, it is safer to use StringBuffer. If you are working in a single-threaded environment or if you can ensure proper synchronization yourself, StringBuilder provides better performance.
