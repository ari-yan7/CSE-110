/* Your task is to input a word into a String. 
 Then print code for each character in the String using the 2nd
method discussed above.
Sample input 1:
Pro
Sample output 1:
P : 80
r : 114
o : 111
*/

import java.util.Scanner;
public class String_Practice_6
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  String s = sc.nextLine();
  for (int index = 0; index<=s.length()-1; index++)
  {
   char ch = s.charAt(index);
   int ascii = (int)ch;
   System.out.println(ascii);
  }
 }
}