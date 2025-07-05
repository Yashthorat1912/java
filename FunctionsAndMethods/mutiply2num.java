package FunctionsAndMethods;

import java.util.*;

public class mutiply2num {
  public static int mul(int a, int b) {
    return a * b;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Value Of a : ");
    int a = sc.nextInt();
    System.out.print("Enter the Value Of b :");
    int b = sc.nextInt();

    System.out.println("Multiplicatio is: " + mul(a, b));
    sc.close();

  }

}
