package Basic_Language.OOPS.InterfacesAndClasses;

class IC1 implements Interf{
	public static void main(String[] args){

//		x = 777;				// CE : can't assign value to final variable X.
	}
}
interface Interf{
    /**
     * !so every variable declared inside interface is final and connot be overriden
     */
	int x = 10;
}