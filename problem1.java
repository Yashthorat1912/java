
// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.
import java.util.*;

public class problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value of a =");
    int a = sc.nextInt();
    System.out.println("Enter Value of b =");
    int b = sc.nextInt();

    System.out.println("\nChoose an operation:");
    System.out.println("1: + (Addition)");
    System.out.println("2: - (Subtraction)");
    System.out.println("3: * (Multiplication)");
    System.out.println("4: / (Division)");
    System.out.println("5: % (Modulo)");

    System.out.print("Enter the operation number (1-5): ");
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Result: " + a + " + " + b + " = " + (a + b));
        break;
      case 2:
        System.out.println("Result: " + a + " - " + b + " = " + (a - b));
        break;
      case 3:
        System.out.println("Result: " + a + " * " + b + " = " + (a * b));
        break;
      case 4:
        if (b != 0) {
          System.out.println("Result: " + a + " / " + b + " = " + (a / b));
        } else {
          System.out.println("Error: Division by zero is not allowed.");
        }
        break;
      case 5:
        if (b != 0) {
          System.out.println("Result: " + a + " % " + b + " = " + (a % b));
        } else {
          System.out.println("Error: Modulo by zero is not allowed.");
        }
        break;
      default:
        System.out.println("Invalid choice. Please select between 1 and 5.");
    }

  }

}
