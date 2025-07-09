package Strings;

public class compare {
  public static void main(String[] args) {
    String name1 = "Tony";
    String name2 = "Tony";
    // always use this

    // if (name1.compareTo(name2) == 0) {
    // System.out.println("Strings are equal");
    // } else {
    // System.out.println("string are not equal");
    // }

    // DO NOT USE == to check for string equality
    // Gives correct answer here
    if (name1 == name2) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("string are not equal");
    }

    // Gives incorrect answer here
    if (new String("Tony") == new String("Tony")) {
      System.out.println("They are the same string");
    } else {
      System.out.println("They are different strings");
    }
  }
}
