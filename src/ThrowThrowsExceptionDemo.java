public class ThrowThrowsExceptionDemo {
    public static void main(String[] args) throws Exception {
        validateAge(15);
    }

    public static void validateAge(int age) throws Exception{
        if (age<18) {
            throw new Exception("Age must be 18 or older");
        }
        System.out.println("Valid age");
    }
}
