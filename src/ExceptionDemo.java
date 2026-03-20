import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch(ArithmeticException e) {
            System.out.println("Cannot be dived by Zero!");
        } finally {
            System.out.println("This block will always be executed");
        }

        try {
            FileReader fr = new FileReader("file.txt");
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found!!");
        }
    }
}
