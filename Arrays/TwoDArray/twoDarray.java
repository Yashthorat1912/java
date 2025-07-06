package Arrays.TwoDArray;

import java.util.*;

public class twoDarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the Value of rows= ");
    int rows = sc.nextInt();
    System.out.print("enter the Value of colums =");
    int colums = sc.nextInt();
    // input
    int[][] numbers = new int[rows][colums];
    // for rows
    for (int i = 0; i < rows; i++) {
      // for colums
      for (int j = 0; j < colums; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }
    // output
    // for rows
    for (int i = 0; i < rows; i++) {
      // for colums
      for (int j = 0; j < colums; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();

  }

}
