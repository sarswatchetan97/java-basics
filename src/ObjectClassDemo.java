import java.util.Objects;

class Laptop {
    String model;
    int price;

//    public String toString() {
//        return "Model: " + model + ", Price: " + price;
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.model = "Lenovo Yoga";
        laptop.price = 21000;

        Laptop laptop1 = new Laptop();
        laptop1.model = "Lenovo Yoga1";
        laptop1.price = 21000;

        System.out.println(laptop.equals(laptop1));
        System.out.println(laptop);
        System.out.println(laptop1);
    }
}
