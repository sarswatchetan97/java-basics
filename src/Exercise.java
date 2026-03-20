public class Exercise {
    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y";

        while(again == "y") {
            if (operator == '+') {
                double sum = num1 + num2;
                System.out.println("Result: " + sum);
                again = "n";
            }
            else if (operator == '-') {
                double sub = num1 - num2;
                System.out.println("Result: " + sub);
//                System.out.println("Thank for using the calculator");
                again = "n";
            }
            else if (operator == '*') {
                double multiply = num1 * num2;
                System.out.println("Result: " + multiply);
//                System.out.println("Thank for using the calculator");
                again = "n";
            }
            else if ((operator == '/') && (num2 == 0)) {
                System.out.println("Cannot divide by zero");
//                System.out.println("Thank for using the calculator");
                again = "n";
            } else if (operator == '/') {
                double division = num1/num2;
                System.out.println("Result " + division);
//                System.out.println("Thank for using the calculator");
                again = "n";
            }
        }
        System.out.println("Thanks for using the calculator. ");
    }
}
