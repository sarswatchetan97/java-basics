class X {
    public void show() {
        System.out.println("in class X");
    }
}

class Y extends X{
    public void show1() {
        System.out.println("in class Y");
    }
}

public class CastingDemo {
    public static void main(String[] args) {
//        double num = 3.4;
//        int intNum = (int) num;
//        System.out.println(intNum);

        X obj = new Y();
        obj.show();

        Y obj1 = (Y) obj;
        obj1.show();
        obj1.show1();

    }
}
