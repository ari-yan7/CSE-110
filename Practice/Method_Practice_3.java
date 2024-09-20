/*Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.

Test Data:
Input a string: 350

Expected Output:
The middle character in the string: 5
*/

import java.util.Scanner;
public class Method_Practice_3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a string: ");
        String str = sc.next();
        System.out.print("The middle character in the string: ");
        middle_character (str);
    }
    public static void middle_character(String str)
    {
        int position;
        int length;
        if (str.length()%2==0)
        {
            position = (str.length()/2)-1;
            length = 2;
        }
        else
        {
            position = str.length()/2;
            length = 1;
        }
        for (int i = 0; i<length; i++)
        {
            System.out.print(str.charAt(position+i));
        }
    }
}