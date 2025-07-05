// Write a function which takes in 2 numbers and returns the greater of those two.
package FunctionsAndMethods.Exercise;

import java.util.*;

public class exe3 {
  public static int greaterNum(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entere the Value of a = ");
    int a = sc.nextInt();
    System.out.print("Entere the Value of b = ");
    int b = sc.nextInt();
    System.out.println(greaterNum(a, b));
    sc.close();
  }

}
