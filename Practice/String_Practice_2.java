/* A java program that takes a string input from the user, 
  removes the characters at even index and 
  prints the resulting string in uppercase 
  without using the buint in function upper().*/

import java.util.Scanner;
public class String_Practice_2
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  String word = sc.nextLine();
  int leng = word.length(); 
  String new_word = "";
  for (int index = 0; index<leng; index++)
  {
   char ch = word.charAt(index);
   if (ch==' ')
   {
    new_word = new_word+ch; 
   }
   else if (index%2==0)
   {
     
   }
   else
   {
    int convert = (int)ch;
    if (convert>=97 && convert<=122)
    {
     int ascii = convert-32;
     new_word = new_word+(char)ascii;
    }
    else 
    {
     new_word = new_word+ch;
    }
   }
  }
  System.out.println(new_word);
 }
}