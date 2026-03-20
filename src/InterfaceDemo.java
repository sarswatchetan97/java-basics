interface Animall{
    void sound();
}

class Cat implements Animall{
    public void sound() {
        System.out.println("Cat meows!!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animall cat = new Cat();
        cat.sound();
    }
}
