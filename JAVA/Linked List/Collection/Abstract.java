// abstract class Sunstar {
//     abstract void printInfo();
// }
 
// class Employee extends Sunstar {
//     void printInfo() {
//         String name = "avinash";
//         int age = 21;
//         float salary = 222.2F;
 
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(salary);
 
//     }
 
// }
 
// class Base {
//     public static void main(String args[]) {
//         Sunstar s = new Employee();
//         s.printInfo();
//     }
// }

// Java Program to Illustrate
// that an instance of Abstract
// Class can not be created

// Class 1
// Abstract class
abstract class Base {
	abstract void fun();
}

// Class 2
class Derived extends Base {
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}

// Class 3
// Main class
class Main {

	// Main driver method
	public static void main(String args[])
	{

		// Uncommenting the following line will cause
		// compiler error as the line tries to create an
		// instance of abstract class. Base b = new Base();

		// We can have references of Base type.
		Base b = new Derived();
		b.fun();
	}
}
