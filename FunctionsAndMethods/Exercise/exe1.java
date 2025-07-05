package FunctionsAndMethods.Exercise;

import java.util.*;

public class exe1 {

  public static int displayAverage(int a, int b, int c) {
    return (a + b + c) / 3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.print("Enter the value of b : ");
    int b = sc.nextInt();
    System.out.print("Enter the value of c : ");
    int c = sc.nextInt();

    System.out.print("Average of 3 numbers is : " + displayAverage(a, b, c));
    sc.close();

  }

}
