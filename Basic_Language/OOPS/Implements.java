package Basic_Language.OOPS;

public class Implements implements ICar {
    public static void main(String[] args) {
        System.out.println("Implements");
    }

    @Override
    public void letsStart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void letsStop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
}



/**
 * Every interface method is always public 
 * and abstract whether we are declaring or not 
 */
interface ICar{
    void letsStart();
    void letsStop();
}
