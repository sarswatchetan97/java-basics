class Demo {
    public void show() throws ClassNotFoundException{
            Class.forName("ThrowDemo");
        }
    }

public class ThrowDemo {
    static {
        System.out.println("Class Found");
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            demo.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
