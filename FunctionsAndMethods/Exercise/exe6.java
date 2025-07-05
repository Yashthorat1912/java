//Write a function that calculates the Greatest Common Divisor of 2 numbers. 
package FunctionsAndMethods.Exercise;

import java.util.*;

public class exe6 {
  public static void divisor(int n1, int n2) {
    while (n1 != n2) {
      if (n1 > n2) {
        n1 = n1 - n2;
      } else {
        n2 = n2 - n1;
      }
    }
    System.out.println("GCD is : " + n2);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    divisor(n1, n2);
    sc.close();
  }
}
