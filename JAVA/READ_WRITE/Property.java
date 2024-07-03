package Basic_Language.READ_WRITE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Property {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("Basic_Language/READ_WRITE/abc.properties");
        p.load(fis);
        System.out.println(p);
        String s = p.getProperty("venki");
        System.out.println(s);
        p.setProperty("nag","88888");
        FileOutputStream fos = new FileOutputStream("Basic_Language/READ_WRITE/abc.properties");
        p.store(fos, "Updated by Durga for SCJP class");
    }
}