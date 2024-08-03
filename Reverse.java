/*
   Java program to reverse String 
*/
import java.util.Scanner;
import java.lang.String;

class Sample {

  public static String reverseString(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any String: ");
    String str = sc.nextLine();
    System.out.println("Reverse string is: " + reverseString(str));
      sc.close();
  }
}
