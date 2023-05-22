package Basic_Language.OOPS.InterfacesAndClasses;

public class IC2 implements Left,Right {

    @Override
    public int m1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm1'");
    }
    @Override
    public void m1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm1'");
    }

}

interface Left {
    public void m1();
}

interface Right {
    public int m1();
}

/*
Q. Is a java class can implement any interfaces simultaneously?
Ans. Yes except a particular case.
If two interfaces contains a method with same signature 
but different return types then it is impossible to implement both 
interfaces simultaneously. 
 */