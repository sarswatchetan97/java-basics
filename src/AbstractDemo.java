abstract class RawCar {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing Music...");
    }
}

class GWagon extends RawCar {
    public void drive() {
        System.out.println("Drives is impressively");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        RawCar rawCar = new GWagon();
        rawCar.drive();
        rawCar.playMusic();
    }
}
