package FunctionsAndMethods.Exercise;

import java.util.*;

public class exe2 {

  public static void printSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n :");
    int n = sc.nextInt();

    printSum(n);
    sc.close();

  }

}
