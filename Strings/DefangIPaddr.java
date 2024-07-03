package Strings;

public class DefangIPaddr {

    public static void defangIPaddr(String address) {
        address.replace(".", "[.]");
        
    }
    public static void main(String[] args) {
        defangIPaddr("1.1.1.1");
        
    }
}
