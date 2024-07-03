package Basic_Language.OOPS;

public interface Interfaces extends a,b {
    
}
interface a{
    /**
     * !remember methods here in interface are abstract
     * !Every method present inside interface is always public and 
     * !abstract whether we are declaring or not.
     * !void m1();
public void m1();
abstract void m1();
public abstract void m1();
all above method declarations are equal inside interface.
     */
    abstract void m1();
    void m2();
}
interface b{
    void m3();
    void m4();
}
/**
The type InterfacesCheck must implement the inherited abstract method b.m4()Java(67109264)
The type InterfacesCheck must implement the inherited abstract method b.m3()Java(67109264)
The type InterfacesCheck must implement the inherited abstract method a.m2()Java(67109264)
The type InterfacesCheck must implement the inherited abstract method a.m1()Java(67109264)
Basic_Language.OOPS.InterfacesCheck
 */
/**
static: Interface methods cannot be static because they are meant to be overridden and implemented by classes.
final: Final methods cannot be overridden by subclasses, but interfaces are designed
to be implemented and extended by other classes,
so final methods are not allowed in interfaces.
 */