// Write a function that takes in the radius as input and returns the circumference of a circle.
package FunctionsAndMethods.Exercise;

import java.util.*;

public class exe4 {
  public static double circumference(double radius) {
    return 2 * 3.14 * radius;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of circle = ");
    double radius = sc.nextDouble();

    System.out.println(circumference(radius));
    sc.close();

  }

}
