public class PrimitiveExample {
    public static void main(String[] args) {
        int a = 5;
        int b = a; // b is now a copy of a
        b = 10; // changing b does not affect a

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
