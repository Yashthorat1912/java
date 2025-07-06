package Arrays;

import java.util.*;;

public class arraym2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of size: ");
    int size = sc.nextInt();

    int numbers[] = new int[size];

    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();

    }

    for (int i = 0; i < size; i++) {
      System.out.println(numbers[i]);
    }
    sc.close();
  }

}
