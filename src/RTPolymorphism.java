class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog Bark's");
    }
}

public class RTPolymorphism {
    public static void main(String[] args){
        Animal1 animal1 = new Dog1();
        animal1.sound();
    }
}
