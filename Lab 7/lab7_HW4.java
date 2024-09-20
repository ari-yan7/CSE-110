/*Write a Java program that takes a sentence as user input and displays the sentence in
aLtErNaTiNg CaPs format. Note that, you have to ignore spaces and other punctuations while
altering the characters. Also, your new sentence will always start with lowercase letters.

Sample Input
Hello World! 

Output
hElLo WoRlD!
*/

import java.util.Scanner;
public class lab7_HW4
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";
        for (int i = 0; i<s.length(); i++)
        {
            int x = (int)s.charAt(i);
            if (i==0 || i%2==0)
            {
                if (x>=65 && x<=90)
                {
                    int new_ascii = x+32;
                    char ch = (char)new_ascii;
                    s2+=ch;
                }
                else
                {
                    s2+=s.charAt(i);
                }
            }
            else 
            {
                if (x>=97 && x<=122)
                {
                    int new_ascii = x-32;
                    char ch = (char)new_ascii;
                    s2+=ch;
                }
                else
                {
                    s2+=s.charAt(i);
                }
            }
        }
        System.out.println(s2);
    }
}