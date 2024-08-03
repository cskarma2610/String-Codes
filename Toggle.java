/*
   Java program to toggle each character in a string
*/

import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;

class Test{

      public static String ToggleString(String str){
             char[] a = str.toCharArray();  // String to array conversion
             int len = a.length;
             
             for(int i = 0; i < len; i++){
                   if (a[i] >= 'a' && a[i] <= 'z') {
                         a[i] = (char)(a[i] - 32);  // Convert lowercase to uppercase
                   } else if (a[i] >= 'A' && a[i] <= 'Z') {
                       a[i] = (char)(a[i] + 32);  // Convert uppercase to lowercase
                      }
                }
             return new String(a);
    
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