public class Main {
    public static void main(String[] args) {
        /*String s1 = "Hello World";
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

        System.out.println(str1==str3); //false*/

//        StringBuffer objStringBuffer = new StringBuffer("Buffer"); //16 + length of String; Useful in Multi-threaded
//        objStringBuffer.append(" Object");
//        objStringBuffer.insert(0, "Hello ");
//        System.out.println(objStringBuffer.toString());
//        System.out.println(objStringBuffer.capacity());
//
//
//        StringBuilder objStringBuilder = new StringBuilder("Builder"); //16 + length of String; Useful in single threaded
//        objStringBuilder.append(" Object");
//        System.out.println(objStringBuilder.toString());
//        System.out.println(objStringBuilder.capacity());

        //If interviewer asks to demonstrate multi-thread and single thread difference

        StringBuilder sb = new StringBuilder();

        Thread t1 = new Thread(() -> {
            for (int i=0; i<1000; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=0; i<1000; i++) {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println(sb.toString().length());

        //Reverse a String
        String reversedString = new StringBuffer("Shailja").reverse().toString();
        System.out.println(reversedString);

        String reversedStringg = new StringBuilder("Babyyyyyy").reverse().toString();
        System.out.println(reversedStringg);

        //String Format
        String formattedString = String.format("Hello, %s! Welcome to %s.", "Friend", "my house");
        System.out.println(formattedString);

    }
}