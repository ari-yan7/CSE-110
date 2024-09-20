/* Write a Java program that takes a string as input and determines whether the string qualifies as
a strong password. A strong password is defined by the following criteria:
➢ The password must be at least 8 characters long.
➢ The password must contain characters at least one -
➢ Uppercase letters (A-Z)
➢ Lowercase letters (a-z)
➢ Digits (0-9)
➢ Special characters (e.g., !, @, #, $, etc.)
Print ‘True’ if the password is strong, and ‘False’ otherwise. You may consider any character
excluding the alphabet, digit, and space as special characters.

Sample Input
StrongPass123!

Output
True

Sample Input
Weak123

Output
False

*/

import java.util.Scanner;
public class lab7_HW6
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean haslength = false;
        if (s.length()>=8)
        {
           haslength = true;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (int i = 0; i<s.length(); i++)
        {
            int x = (char)s.charAt(i);
            if (x >= 65 && x <= 90) 
            {
                hasUppercase = true;
            } 
            else if (x >= 97 && x <= 122) 
            {
                hasLowercase = true;
            } 
            else if (x >= 48 && x <= 57) 
            {
                hasDigit = true;
            } 
            else if ((x >= 33 && x <= 47) || (x >= 58 && x <= 64) || (x >= 91 && x <= 96) || (x >= 123 && x <= 126)) 
            {
                hasSpecial = true;
            }
        }
        if (hasUppercase && hasLowercase && hasDigit && hasSpecial && haslength) 
        {
            System.out.println("True");
        } 
        else 
        {
            System.out.println("False");
        }
    }
}