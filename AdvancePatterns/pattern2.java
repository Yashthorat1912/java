package AdvancePatterns;

import java.util.*;

public class pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      int spaces = n - i;
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
