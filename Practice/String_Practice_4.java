/* Write a program which takes a string as input and returns the number of characters in the string.
Sample input 1:
Programming
Sample output 1:
11
*/

import java.util.Scanner;
public class String_Practice_4
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter your string");
  String s = sc.nextLine();
  System.out.println(s.length());
 }
}