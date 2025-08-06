package Recursion;

// Print number from 1 to 5 using recursion
public class Ex2 {
  public static void main(String[] args) {
    int n = 1;
    printNumber(n);
  }

  public static void printNumber(int n) {
    if (n == 6) {
      return;
    }
    System.out.println(n);
    printNumber(n + 1);
  }
}
