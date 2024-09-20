/* Write a Java program that takes a string as input and 
  reverses the order of words in it.
  
Sample Input                 Output
CSE110 is easy               easy is CSE110
*/


import java.util.Scanner;
public class Lab7_HW1
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner (System.in);
  String s = sc.nextLine()+" ";
  int word_count = count_word(s);
  String [] word = new String [word_count];
  String temp = "";
  int j = 0;
  for (int i = 0; i<s.length(); i++)
  {
   if (s.charAt(i)!=' ')
   {
    temp+=s.charAt(i);
   }
   else
   {
    word[j++]=temp;
    temp="";
   }
  }
  for (int i = word.length-1; i>=0; i--)
  {
   if (word[i]==null)
   {
    System.out.print(" ");
   }
   else
   {
    System.out.print(word[i]+" ");
   }
  }
 }
 public static int count_word(String s)
 {
  int word = 1;
  for (int i = 0; i<s.length(); i++)
  {
   if (s.charAt(i)==' ')
   {
    word++; 
   }
  }
  return word;
 }
}