package Basic_Language.String;

public class StringBuffered {
    public static void main(String[] args) {
        commonMethods();
    }

    private static void commonMethods() {
        StringBuffer sb = new StringBuffer("Prashant");
        sb.append("durga").append("software").append("solution").delete(2,10).reverse();
        //!---> chaining
        String s1 = new String("Durga");
        String s2 = s1.concat("Software");
        String s3 = s2.intern();    
        System.out.println(s3);

    }
}
