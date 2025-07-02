import java.util.*;

public class oddeven {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the Number To check Odd Even =");
    int num = s.nextInt();

    if (num % 2 == 0) {
      System.out.println("Even Number");
    } else {
      System.out.println("odd number");
    }

  }
}
