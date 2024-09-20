/* Captain Jack and his crew have discovered a treasure chest full of gold coins. However, the
chest comes with a mysterious lock. To open it, they need to input a phrase that should contain
a combination of characters where vowel count is divisible by 3 and consonant count is
divisible by 5. Write a Java program to help Captain Jack determine if the input phrase has
the correct number of vowels and consonants to unlock the treasure chest.
Note: Vowels and Consonants count has to be greater than 0 for the treasure to open

Sample Input
Yo-hoo-hoo!

Output 
Blimey! No Plunder!!

Explanation: The input string has five vowels ‘o, o, o,
o, o’ which is not divisible by 3 and the same applies for
consonant rules as well where count of consonants is not
divisible by 5. Hence the chest cannot be opened.

Sample Input
Yo-ho-Ya-ho-hoo!

Output
Aaarr! Me Plunder!!

Explanation: The input string has six vowel count
which is divisible by 3 and the same applies for
consonant rules as well where count of consonants is
divisible by 5. Hence the chest can be opened. 

Sample Input 
aoouii-uii 

Output
Blimey! No Plunder!!

Explanation: Here the vowel count is divisible by 3, but
the consonant count being 0 resulted in the chest not
being opened.
*/

import java.util.Scanner;
public class Lab7_EV2
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  String s = sc.nextLine();
  int v_count = 0;
  int c_count = 0;
  String lower_s = s.toLowerCase();
  for (int i = 0; i<lower_s.length(); i++)
  {
   char c = lower_s.charAt(i);
   if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
   {
    v_count+=1;
   }
   else
   {
    c_count+=1; 
   }
  }
  if (v_count%3==0 && c_count%5==0 && v_count>0 && c_count>0)
  {
   System.out.println("Aaarr! Me Plunder!!");
  }
  else
  {
   System.out.println("Blimey! No Plunder!!");
  }
 }
}