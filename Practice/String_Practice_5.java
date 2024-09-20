/* Input a word into a String. Print each character on a line by itself.
Sample input 1:
Program
Sample output 1:
P
r
o
g
r
a
m
*/

import java.util.Scanner;
public class String_Practice_5
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter your string");
  String s = sc.nextLine();
  for (int index = 0; index<=s.length()-1; index++)
  {
   String s1 = "";
   s1+= (char)s.charAt(index);
   System.out.println(s1);
  }
 }
}