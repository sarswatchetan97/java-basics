public class OuterClassDemo {
    private static int staticOuterField = 10;

    static class StaticNestedClass {
        void display() {
            System.out.println("Static outer field: " + staticOuterField);
        }
    }

    public static void main(String[] args) {
        OuterClassDemo.StaticNestedClass nested = new OuterClassDemo.StaticNestedClass();
        nested.display();
    }
}
