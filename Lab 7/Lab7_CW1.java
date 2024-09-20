/* Write a Java program that will take a String as input and convert the lowercase letters to the
uppercase letters. The program should keep the other characters (i.e. uppercase letters and
symbols) unchanged.
Sample Input 
JavaProgrammer123++

Output
JAVAPROGRAMMER123++ 
*/

import java.util.Scanner;
public class Lab7_CW1
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter your string");
  String s1 = sc.nextLine();
  String s = "";
  for (int index = 0; index<=s1.length()-1; index++)
  {
   int ascii = (int)s1.charAt(index);
   if (ascii>=97 && ascii<=122)
   {
    ascii-=32;
    char a = (char)ascii;
    s+=a;
   }
   else 
   {
    s+=s1.charAt(index);
   }
  }
  System.out.println(s);
 }
}