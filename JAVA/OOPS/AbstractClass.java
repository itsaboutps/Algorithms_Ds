package Basic_Language.OOPS;

public class AbstractClass {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 2020);

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        car.start();
        car.stop();
    }
}




// Abstract class to define a common base for vehicles
abstract class Vehicle implements ICar {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract method to start the vehicle
    //!abstract method does not provide method logic
    public abstract void start();

    // Concrete method to stop the vehicle
    public final void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Getter methods for make, model, and year
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Concrete class for a car
class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    public void start() {
        System.out.println("Car started.");
    }
    // public void stop(){

    @Override
    public void letsStart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'letsStart'");
    }

    @Override
    public void letsStop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'letsStop'");
    }
        
}

