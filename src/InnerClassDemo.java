public class InnerClassDemo { //This is an Outer class
    private int outerField = 10;

    class Inner {
        void display() {
            System.out.println("Outer Field: " + outerField);
        }
    }

    public static void main(String[] args) {
        InnerClassDemo outer = new InnerClassDemo();
        InnerClassDemo.Inner inner = outer.new Inner();
        inner.display();
    }
}
