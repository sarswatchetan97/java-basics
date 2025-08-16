class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

public class InheritanceExample {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
