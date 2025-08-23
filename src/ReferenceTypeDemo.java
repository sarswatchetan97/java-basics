class Refrence {
    String name;
}

public class ReferenceTypeDemo {
    public static void main(String[] args) {
        Refrence obj1 = new Refrence();
        obj1.name = "Chetan";

        // obj2 is a reference to the same object as obj1
        Refrence obj2 = obj1;
        obj2.name = "Shailja"; //modifying obj2 affects obj1

        System.out.println("Value of obj1 name: " + obj1.name);
        System.out.println("Value of obj2 name: " + obj2.name);
    }
}
