package Patterns;

import java.util.*;

public class pattern1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n:");
    int n = sc.nextInt();
    System.out.print("Enter value of m:");

    int m = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        System.out.print(" * ");

      }
      System.out.println();
    }
    sc.close();
  }

}
