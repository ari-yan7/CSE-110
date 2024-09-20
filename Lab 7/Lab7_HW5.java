/* Write a Java program to remove duplicate characters from a given string that appeared in
 another given string.

 Given String 1: THERE is no EEE LAB in 9 th Floor.
 Given String 2: Table

 Output
HR is no  in 9 h Foor.
*/

import java.util.Scanner;
public class Lab7_HW5
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd string: ");
        String str2 = sc.nextLine();
        String str3 = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i<str1.length(); i++)
        {
            boolean found = false;
            for (int j = 0; j<str2.length(); j++)
            {
                if (str1.charAt(i)==str2.charAt(j))
                {
                    found = true;
                    break;
                }
            }
            if (found==false)
            {
                str3+=str1.charAt(i);
            }
        }
        System.out.println(str3);
    }
}