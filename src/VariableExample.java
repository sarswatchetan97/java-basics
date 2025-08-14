public class VariableExample {
//    int instanceVar;
//
//    public void show() {
//        System.out.println(instanceVar);
//    }

    static int staticVar = 100;

    public static void show() {
        System.out.println(staticVar);
    }

    public static void main(String[] args) {
//        VariableExample varEx = new VariableExample();
//        varEx.show();
        VariableExample.staticVar = 200;
        VariableExample.show();
    }
}
