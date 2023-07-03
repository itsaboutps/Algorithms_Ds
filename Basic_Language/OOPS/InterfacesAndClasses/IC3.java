package Basic_Language.OOPS.InterfacesAndClasses;

class IC3 implements ILefty, IRighty{

	public static void main(String[] args){
		//sopln(x);			//CE : reference to x is ambiguous.
//		sopln(Lefty.x);	//100
//		sopln(Righty.x); //888
	}
}
