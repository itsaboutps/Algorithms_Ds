package Basic_Language;

public class Casting {
    public static void main(String[] args) {
        System.out.println("Hello Casting");

        // Object o = new String("Test");

        // StringBuffer sb = (StringBuffer) o; //! error is thrown in this
        /**
         * !--> Object o = new String("Test");
         # we can use interface reference to hold implemented class object.
         #  A		b	=	(C)		d;
            |		|		 |		|
            |		|		 |		|
            |		|		 |		|
            |		|		 |		|
            class|		Name	      class|	     Reference
            interface	of	      Interface	     variable
            name		reference     Name	     Name

            ##! The type of 'd' and 'c' must have some relation either child to parent or parent to child or same type otherwise we will get compile time error
                saying inconvertable types found 'd' type required 'c'.
         **/
        Object o = new String("Test");

if (o instanceof StringBuffer) {
   StringBuffer sb = (StringBuffer) o;
   // perform operations on sb
} else {
   System.out.println("Object cannot be cast to StringBuffer");
}
    }
}
