package Patterns;

import java.util.*;

public class pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = sc.nextInt();
    System.out.print("Enter the value of m:");
    int m = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (i == 1 || j == 1 || i == n || j == m) {
          System.out.print(" * ");

        } else {
          System.out.print("   ");
        }

      }
      System.out.println();
    }

  }

}
