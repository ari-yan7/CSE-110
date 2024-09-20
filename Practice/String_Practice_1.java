/* Sample input
   aBcDeFgH
   
   Output
   abcdefgh
*/

import java.util.Scanner;
public class String_Practice_1
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  String word = sc.nextLine();
  String new_word =""; 
  int leng = word.length();
  
  for (int index=0; index<leng; index++)
  {
   char ch = word.charAt(index); 
   int convert = (int)ch;
   
   if (convert>=65 && convert<=90)
   {
    int ascii = convert+32;
    new_word = new_word+(char)ascii;
   }
   else
   {
    new_word = new_word+ch;
   }
  }
  System.out.println(new_word);
 }
}