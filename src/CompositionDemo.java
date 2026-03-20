interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}

class Car1 {
    private Engine engine;

    public Car1(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

class Bike {
    private Engine engine;

    public Bike(Engine engine) {
        this.engine = engine;
    }

    public void ride() {
        engine.start();
        System.out.println("Bike is riding");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car1 car = new Car1(new DieselEngine());
        car.drive();

        Bike bike = new Bike(new PetrolEngine());
        bike.ride();
    }
}
