/* Write a Java program that will take two Strings as user input and print the number of times the
 second String occurs in the first String.
Sample Input
 str1 = "She sells sea shells on the sea shore."
 str2 = "se"

 Output
 Occurrence: 3 times
*/

import java.util.Scanner;
public class Lab7_HW7
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String str1 = sc.nextLine();
        System.err.println("Enter the 2nd string: ");
        String str2 = sc.nextLine();
        int count = 0;
        for (int i = 0; i<str1.length(); i++)
        {
            for (int j = 0; j<str2.length()-1; j++)
            {
                if (str1.charAt(i)==str2.charAt(j) && str1.charAt(i+1)==str2.charAt(j+1))
                {
                    count++;
                }
            }
        }
        System.out.println("Occurrence: "+count+" times");
    }
}