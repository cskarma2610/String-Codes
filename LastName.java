/*
   Java program to display last name 
*/
import java.util.Scanner;
import java.lang.String;

class Sample{
    
      public static String lastName(String str){
                int i = str.indexOf(" ");
		String lname = str.substring(i + 1);
                return lname;
          }

      public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
   	     System.out.print("Enter any Name: ");
             String str = sc.nextLine();
             System.out.println("Last name is: " + lastName(str));
             sc.close();
     }
}