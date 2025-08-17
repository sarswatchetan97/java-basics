class Calculator {
    //Method Overloading
    int add(int a, int b) {
        return a+b;
    }

    double add(double a, double b) {
        return a+b;
    }
}

public class CTPolymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        var result1 = cal.add(2, 3);
        var result2 = cal.add(2.5, 3.5);
        System.out.println(result1);
        System.out.println(result2);
    }
}
