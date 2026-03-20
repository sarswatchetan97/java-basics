import java.util.ArrayList;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        //Autoboxing: converting int to Integer
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt;

        //Unboxing: converting Integer to int
        Integer wrapInt = 20;
        int primInt = wrapInt;

        //Autoboxing in collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        //Unboxing from collections
        int first = list.get(0); // Unboxing
        int second = list.get(1); //Unboxing

        System.out.println("Autoboxing: " +wrapperInt);
        System.out.println("Unboxing: " +primInt);
        System.out.println("Autoboxing in collection: " + list);
        System.out.println("Unboxing from collection: " +first+ " " +second);
    }
}
