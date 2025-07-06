package Arrays;

import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size = ");
    int size = sc.nextInt();

    int numbers[] = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.print("Enter the numbers = ");
      numbers[i] = sc.nextInt();
    }
    System.out.println("Enter the number to search length = ");
    int x = sc.nextInt();
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == x) {
        System.out.println("x found at index = " + i);
      }
    }
    sc.close();
  }

}
