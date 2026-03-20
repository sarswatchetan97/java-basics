class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(1);
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in B int");
    }
}

public class SuperAndThisDemo {

    public static void main(String[] args) {
        B obj = new B(2);
    }
}
