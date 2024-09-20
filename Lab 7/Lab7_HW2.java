/* Write a Java program that has a given string and prints a compressed version of the
string by counting the consecutive occurrences of each character. 

Given string 
aabcccccaaa

Output
a2b1c5a3

Given string 
aArr

Output
a1A1r2
*/

import java.util.Scanner;
public class Lab7_HW2 
{
    public static void main(String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=1;
        for (int i = 0; i<s.length()-1; i++) 
        { 
            if (s.charAt(i)==s.charAt(i+1)) 
            {
                count++;
            } 
            else 
            {
                System.out.print(s.charAt(i)+""+count);
                count=1;
            }
        }
        System.out.print(s.charAt(s.length()-1)+""+count);
    }
}