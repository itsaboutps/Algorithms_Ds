package Basic_Language;

class AnimalUpCasting {
    public void makeSound() {
       System.out.println("AnimalUpCasting is making a sound");
    }
 }
 
 class DogUpCasting extends AnimalUpCasting {
    public void makeSound() {
       System.out.println("DogUpCasting is barking");
    }
 }
 
 public class UpCasting {
    public static void main(String[] args) {
       AnimalUpCasting animal = new DogUpCasting();  // upcasting
       animal.makeSound();
    }
 }
 
