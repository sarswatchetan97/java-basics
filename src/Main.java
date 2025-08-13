public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World";
        //String Pool

        String s2 = s1.concat("Hello");
        //Heap Memory

        String s3 = s1.concat("Hello").intern();
        //String Pool

        String s4 = new String("Hello WorldHello");
        //Heap Memory

        String s5 = "Hello WorldHello";
        //will refer to object in String Pool - s3

        String str1 = new String("Hello");
        //New Object in Heap Memory

        String str2 = new String("Hello");
        //New Object in Heap Memory

        System.out.println(str1==str2); //false

        String str3 = "Hello";
        //Creating in String Pool

        System.out.println(str1==str3); //false
    }
}