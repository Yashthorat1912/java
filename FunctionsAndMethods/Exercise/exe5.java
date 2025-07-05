// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
package FunctionsAndMethods.Exercise;

import java.util.*;

public class exe5 {
  public static boolean eligibleToVote(int age) {
    if (age > 18) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Age: ");
    int age = sc.nextInt();

    System.out.println(eligibleToVote(age));
    sc.close();
  }
}
