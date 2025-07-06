//For a given matrix of N x M, print its transpose.
package Arrays.TwoDArray;

import java.util.Scanner;

public class Example2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n = ");
    int n = sc.nextInt();
    System.out.print("Enter the value of m = ");
    int m = sc.nextInt();

    int matrix[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("The transpose is : ");
    // To print transpose
    for (int j = 0; j < m; j++) {
      for (int i = 0; i < n; i++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }

}
