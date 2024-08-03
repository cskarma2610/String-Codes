/*
   Java program to display Middile name 
*/

import java.util.Scanner;
import java.lang.String;

class Sample{
    
      public static String middileName(String str){
                int i = str.indexOf(" ");
                int j = str.lastIndexOf(" ");
		String mname = str.substring(i + 1 , j);
                return mname;
          }

      public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
   	     System.out.print("Enter any Name: ");
             String str = sc.nextLine();
             System.out.println("Last name is: " + middileName(str));
               sc.close();
             //System.out.println(middileName(str).length());
     }
}