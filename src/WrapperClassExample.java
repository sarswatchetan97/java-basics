import java.util.ArrayList;

public class WrapperClassExample {
    public static void main(String[] args) {
        int num = 10; //Primitive data type
        Integer obj = Integer.valueOf(num); //Primitive to Wrapper (Boxing)

        int value = obj.intValue(); //Wrapper to Primitive (Unboxing)

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //Autoboxing of int to Integer

        String str = "123";
        int num1 = Integer.parseInt(str); //converts str to int
        System.out.println(num1);

        Integer obj1 = null; //allowed
//      int num2 = null; // not allowed - compile time error

        int num2 = 5;

        Integer obj2 = num2; //Autoboxing

        String str1 = obj.toString(); //Converts to string using utility methods

        int val = obj2; //Auto-unboxing

        System.out.println("Primitive: " + val);

    }
}
