public class AnonymousObj {

    public AnonymousObj() {
        System.out.println("Default Constructor");
    }

    void display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {
        new AnonymousObj().display();
    }
}
