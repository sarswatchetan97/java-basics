public class CastingExample {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = num1;
        System.out.println(num2);

        int num3D = 100;
        double num3Double = num3D;
        System.out.println(num3Double);

        double num3 = 10.5;
        int num4 = (int) num3;
        System.out.println(num4);

        double num5I = 100.5;
        int num5Integer = (int) num5I;
        System.out.println(num5Integer);
    }
}
