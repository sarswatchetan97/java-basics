//Only possible incase of Inheritance

class AB {
    public void show() {
        System.out.println("in AB");
    }
}

class BC extends AB {
    public void show() {
        System.out.println("in BC");
    }
}

class CD extends AB {
    public void show() {
        System.out.println("in CD");
    }
}

public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        AB objAB = new AB();
        objAB.show();

        AB obj = new BC();
        obj.show();

        obj = new CD();
        obj.show();
    }
}
