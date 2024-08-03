/*
   Java program to toggle each character in a string
*/

import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;

class Test{

      public static String ToggleString(String str){
             
             int len = str.length();
             String  str1 = ""; 
             char ch, ch1;
             for(int i = 0; i < len; i++){
                   ch = str.charAt(i);
                   if (ch >= 'a' && ch <= 'z') {
                         ch = (char)(ch - 32);  // Convert lowercase to uppercase
                   } else if (ch >= 'A' && ch <= 'Z') {
                       ch = (char)(ch + 32);  // Convert uppercase to lowercase
                      }
                  str1 = str1 + ch;
                }
             return str1;
    
       }
 
      public static void main(String[] args){
               
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter any String : ");
              String str = sc.nextLine();
              System.out.println("Before Toggling : " + str);
              System.out.println("After Toggling : " + ToggleString(str));
              sc.close(); // closing the connection
         }
        
}