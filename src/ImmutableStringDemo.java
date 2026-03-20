public class ImmutableStringDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Ram");
//        System.out.println(stringBuffer.capacity());
        stringBuffer.append(" Shyam");
//        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(2);
//        System.out.println(stringBuffer);
        stringBuffer.insert(0, "Java ");
//        System.out.println(stringBuffer);
        stringBuffer.setLength(5);
        System.out.println(stringBuffer);
    }
}
