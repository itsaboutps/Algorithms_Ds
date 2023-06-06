package Basic_Language.AutoBox;

public class AutoBoxing {
    static Integer a=10;
    static Integer b = 10;
    public static void main(String[] args) {
        // int i =a;
        a+=1;
        System.out.println(a==b);
    }
}
