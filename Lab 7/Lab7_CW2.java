/* Write a Java program to check if a string is palindrome or not. 
  A string is palindrome if the reverse of the string is the same as the original string. 
[You cannot use any built-in functions other than .equals( ), .charAt( ), .length( )]

Sample input
madam 

Sample output
true

Sample input
Abracadabra 

Sample output
false
*/

import java.util.Scanner;
public class Lab7_CW2
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter your string");
  String s = sc.nextLine();
  int count = 0;
  for (int leftindex = 0, rightindex = s.length()-1; rightindex>leftindex; leftindex++ , rightindex--)
  {
   if (s.charAt(rightindex)!= s.charAt(leftindex))
   {
    count++;
    break;
   }
  }
  if (count == 0)
  {
   System.out.println("True");
  }
  else
  {
   System.out.println("False"); 
  }
 }
}