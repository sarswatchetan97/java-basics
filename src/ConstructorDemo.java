class InterPrep1 {
    String name;
    int age;

    InterPrep1(String name, int age) { //Constructor
        this.name = name;
        this.age = age;
    }
}

public class ConstructorDemo {
    public static void main(String[] args){
        InterPrep1 obj = new InterPrep1("Chetan", 28);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}

