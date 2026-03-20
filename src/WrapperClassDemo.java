public class WrapperClassDemo {
    public static void main(String[] args) {
        int num = 3;
        Integer num1 = num;

        int num2 = num1;
        System.out.println(num2);

        System.out.println(num1);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
