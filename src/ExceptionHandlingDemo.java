class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int i=4;
        int j=0;

        int[] arr = new int[5];

        try {
            int res = i/j;
            if (j==0) {
                throw new MyException("Cannot divide by Zero");
            }
//            System.out.println(res);
//            int something = arr[5];
        } catch (MyException e) {
            int res = i/1;
            System.out.println(res);
            System.out.println("That's default output" + e);
        }
        catch (Exception e) {
            System.out.println("Please verify array size");
        }
    }
}
