#Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division 
  using class.
    Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
    Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string

Solution:Approch 1:By Creating Class of BasicCalculator
  
import java.util.Scanner;
class BasicCalculator {
    public static double add(double a, double b) {
        return a + b;//it will return addition 
    }

    public static double subtract(double a, double b) {
        return a - b;//it will return substraction
    }

    public static double multiply(double a, double b) {
        return a * b;//it will return Multiplication
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;//it will return division
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;////it will return NAN value
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();//taking input for first element

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();//taking input for second element

        System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = scanner.next();//taking input for Operation(+,-,*,/)

        double result = 0;

        if (operation.equals("+")) {
            result = BasicCalculator.add(a, b);
        } else if (operation.equals("-")) {
            result = BasicCalculator.subtract(a, b);
        } else if (operation.equals("*")) {
            result = BasicCalculator.multiply(a, b);
        } else if (operation.equals("/")) {
            result = BasicCalculator.divide(a, b);
        } else {
            System.out.println("Error: Invalid operation.");
            System.exit(0);
        }

        System.out.println("Result: " + result);//final result will be display in output
    }
}
Time Complexity:O(n)=O(1)
Space Complexity:O(1)
