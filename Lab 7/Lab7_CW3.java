/* Write a Java program that splits a given string on a given split character. The first input is a
String and the second input is the character that will be used to split the first String.
Sample Input
I-love-Java
-

Sample Output
I
love
Java 

Sample Input 
tom@gmail,harry@yahoo,bob@gmail
,

Sample Output 
tom@gmail
harry@yahoo
bob@gmail

Explanation: The second input which is the
character ',' is used to split the first input string
'tom@gmail,harry@yahoo,
bol@gmail,mary@gmail' into four separate email
addresses.
*/

import java.util.Scanner;
public class Lab7_CW3
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter your string");
  String s = sc.nextLine();
  System.out.println("Enter your character");
  String ch = sc.nextLine();
  char c = ch.charAt(0);
  for (int index = 0; index<s.length(); index++)
  {
   String s1 = "";
   if ((char)s.charAt(index) == c)
   {
    System.out.println();
   }
   if ((char)s.charAt(index) != c)
   {
    s1+=(char)s.charAt(index);
   }
   System.out.print(s1);
  }
  System.out.println();
 }
}