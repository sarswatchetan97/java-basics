class ABC {
    public int add(int n1, int n2) {
        return n1+n2;
    }
}

class DEF extends ABC {
    @Override
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

public class OverridingDemo {

    public static void main(String[] args) {
        DEF obj = new DEF();
        int r1 = obj.add(1,2);
        ABC obj1 = new ABC();
        System.out.println(r1);
        int r2  = obj1.add(2,3);
        System.out.println(r2);
    }
}
