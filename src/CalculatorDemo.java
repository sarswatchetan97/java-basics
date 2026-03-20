public class CalculatorDemo extends SimpleCalc1{
    public static void main(String[] args) {
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        int r1 = calculatorDemo.add(3,4);
        int r2 = calculatorDemo.sub(4, 2);
        int r3 = calculatorDemo.multiply(3,3);
        int r4 = calculatorDemo.divide(4,2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
