import java.util.*;

public class TakingInput {
  public static void main(String[] args) {
    System.out.print("Enter Your Name = ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name);
    System.out.println("Enter 1st Number =");
    int a = sc.nextInt();
    System.out.println("Enter 2nd Number =");
    int b = sc.nextInt();
    System.out.println("Sum of Two Number is");
    int sum = a + b;
    System.out.println(sum);

  }

}
