abstract class Animal2 {
    private String name;

    //Constructor in abstract class
    public Animal2(String name) {
        this.name = name;
    }

    //Abstract method(no implementation)
    public abstract void makeSound();

    //Concrete method
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}

interface Pet {
    //Abstract method
    void Play();

    //Default method (concrete method)
    default void beFriendly() {
        System.out.println("Being friendly.");
    }

    //Static method (concrete method)
    static void showAffection(){
        System.out.println("Show affection.");
    }
}

//class that extends abstract class and implements interface
class Dog2 extends Animal2 implements Pet {
    public Dog2(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void Play() {
        System.out.println("Dog is playing");
    }
}

public class AbstactVsInterface {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2("Tommy");
        myDog.makeSound();
        myDog.Play();
        myDog.beFriendly();
        myDog.sleep();

        Pet.showAffection();
    }
}
