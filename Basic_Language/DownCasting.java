package Basic_Language;

class Animal {
    public void makeSound() {
       System.out.println("Animal is making a sound");
    }
 }
 
 class Dog extends Animal {
    public void makeSound() {
       System.out.println("Dog is barking");
    }
 
    public void playFetch() {
       System.out.println("Dog is playing fetch");
    }
 }
 
 public class DownCasting {
    public static void main(String[] args) {
       Animal animal = new Dog();  // upcasting
       if (animal instanceof Dog) {
          Dog dog = (Dog) animal;  // downcasting
          dog.playFetch();
       }
    }
 }
 