@FunctionalInterface
interface FuncInt {
    void show();
}

//class Some implements FuncInt {
//    public void show() {
//        System.out.println("In Show");
//    }
//}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        FuncInt obj = new FuncInt() {
            public void show() {
                System.out.println("In Show");
            }
        };
        obj.show();
    }
}
