package Strings;

public class subString {
  public static void main(String[] args) {
    String name = "TonyStarks";
    // name.length()-2 give length of this string is 10-2 = 8
    String Ans = name.substring(2, name.length() - 2);
    System.out.println(Ans);
    // substring given here name.substring(begning index, end index)
    Ans = name.substring(2, 4);
    System.out.println(Ans);
  }

}
