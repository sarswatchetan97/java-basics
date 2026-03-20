interface Vehicle {
    void start();

    default void honk() {
        System.out.println("Honking");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void honk() {
        System.out.println("Honking in custom sound");
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk();
    }
}
