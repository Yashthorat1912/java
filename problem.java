import java.util.*;

public class problem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number For Table:");
    int n = sc.nextInt();
    for (int i = 1; i < 11; i++) {
      System.out.println(i * n);
    }
  }

}
