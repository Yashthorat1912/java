package FunctionsAndMethods;

import java.util.*;

public class functions {

  public static void printMyName(String name) {
    System.out.println(name);
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Name to Display: ");
    String name = sc.nextLine();
    printMyName(name);
    sc.close();
  }
}
