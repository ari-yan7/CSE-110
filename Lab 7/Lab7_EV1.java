/* Write a JAVA program that will take one string input from the user. 
  Then prints the string in reverse. 
Sample Input 
ABCD

Output
DCBA

Sample Input 
Hello!

Output
!olleH
*/

import java.util.Scanner;
public class Lab7_EV1
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter your string");
  String s = sc.nextLine();
  String s1 = "";
  for (int last_index = s.length()-1; last_index>=0; last_index--)
  {
   s1+= s.charAt(last_index); 
  }
  System.out.println(s1);
 }
}