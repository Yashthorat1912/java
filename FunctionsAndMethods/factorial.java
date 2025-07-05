package FunctionsAndMethods;

import java.util.*;

public class factorial {
  public static void printfactorial(int n) {
    if (n < 0) {
      System.out.println("Invalid Number");
      return;

    }
    int factorial = 1;
    for (int i = n; i >= 1; i--) {
      factorial = factorial * i;

    }
    System.out.println(factorial);
    return;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();

    printfactorial(n);
    sc.close();
  }

}
