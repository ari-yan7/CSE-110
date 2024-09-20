/* Write a Java program that takes two strings (lowercase) as user input. Your task is to concat
the two strings except the common characters present in the strings. Then print the modified
string (uppercase). You can assume that each string will only contain unique characters; that
means there will be no duplicate characters in a particular string.

Sample Input
abcd
bdgc

Output
AG

*/

import java.util.Scanner;
public class lab7_HW3 
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner(System.in);
  String word1 = sc.nextLine();
  String word2 = sc.nextLine();
  String word = "";
  boolean flag = true;
  for (int i = 0; i<word1.length(); i++)
  {
    char ch = word1.charAt(i);
    flag = true;
    for (int j = 0; j<word2.length(); j++)
    {
        if (ch == word2.charAt(j))
        {
            flag = false;
        }
    }
    if (flag)
    {
        word+=ch;
    }
  }
  for (int i = 0; i<word2.length(); i++)
  {
    char ch = word2.charAt(i);
    flag = true;
    for (int j = 0; j<word1.length(); j++)
    {
        if (ch == word1.charAt(j))
        {
            flag = false;
        }
    }
    if (flag)
    {
        int asci = (int)ch-32;
        word+=(char)asci;
    }
  }
  System.out.print(word.toUpperCase());
 }   
}