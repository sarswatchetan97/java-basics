// Class marked as "final" cannot be extended
// Variable marked as "final" cannot be modified
// Method marked as "final" cannot be overridden

class Calc {
    public final void show() {
        System.out.println("in Calc");
    }

    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

//class AdvCalc extends Calc {
//    public void show() {
//
//    }
//}

public class FinalDemo {
    public static void main(String[] args) {
        Calc calcObj = new Calc();
        calcObj.show();
        calcObj.add(2, 3);
    }
}
