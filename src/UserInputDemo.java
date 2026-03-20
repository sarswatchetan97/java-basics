import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number: ");

//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        int num = Integer.parseInt(bufferedReader.readLine());
//        System.out.println(num);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);























    }
}
