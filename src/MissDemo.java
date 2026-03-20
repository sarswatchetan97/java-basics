public class MissDemo {

    int age = 23;
    static String name = "Chetan";

    static void displayMsg() {
        System.out.println("Static Method");
        System.out.println("From Static: " + name);
    }

//    private int age;
//    private String name;
//
////    public MissDemo(int age, String name) {
////        this.name = name;
////        this.age = age;
////    }
//
//    public MissDemo() {
//        age = 12;
//        name = "Some";
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name)
//    {
//        this.name = name;
//    }

    public static void main(String[] args) {
        MissDemo missDemo = new MissDemo();
        System.out.println(missDemo.age);
        System.out.println(MissDemo.name);
        MissDemo.displayMsg();
//        missDemo.setAge(33);
//        missDemo.setName("Ram");
//        System.out.println(missDemo.getAge());
//        System.out.println(missDemo.getName());
    }
}
