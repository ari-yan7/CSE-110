/* Write a Java program that takes a string as input and counts the number of vowels (a, e, i, o, u) present
in the string.
Sample input 1:
Programming
Sample output 1:
3
*/

import java.util.Scanner;
public class String_Practice_3
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter your string");
  String s = sc.nextLine();
  int count = 0;
  for (int index = 0; index<=s.length()-1; index++)
  {
   char c = (char)s.charAt(index); 
   if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' ||  c=='e' || c=='i' || c=='o' || c=='u')
   {
    count++; 
   }
  }
  System.out.println(count);
 }
}