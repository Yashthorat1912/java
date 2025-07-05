package FunctionsAndMethods;

import java.util.*;

public class addtwonum {
  public static int add(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.print("Enter the value of b : ");
    int b = sc.nextInt();

    int sum = add(a, b);
    System.out.println("Sum of two No is : " + sum);
    sc.close();

  }

}
