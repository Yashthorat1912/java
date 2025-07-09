package Strings;

public class concatination {
  public static void main(String[] args) {
    // contanation
    String name = "Tony";
    String lastName = "Strak";
    String fullName = name + "@" + lastName;
    System.out.println(fullName);
    // length of string
    System.out.println(fullName.length());
    for (int i = 0; i < fullName.length(); i++) {
      System.out.println(fullName.charAt(i));
    }
  }
}
