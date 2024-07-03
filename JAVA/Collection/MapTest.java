package Basic_Language.Collection;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args)throws Exception {
        HashMap m = new HashMap();
        Temp t = new Temp();
        m.put(t, "durga");
        System.out.println(m);
        t = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);

   }
}
class Temp{
    public String toString() {
        return "temp";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}