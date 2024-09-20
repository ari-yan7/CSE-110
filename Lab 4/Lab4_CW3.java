/* Write a Java program that will keep taking integer numbers as inputs from the user and print
 the square of those numbers until it gets a negative number and then stop.
 Sample Input/Output:(The purple numbers are input.)
 Enter Number:2
 2^2=4
 Enter Number:6
 6^2=36
 Enter Number:1
 1^2=1
 Enter Number:4
 4^2=16
 Enter Number:-5
*/

import java.util.Scanner;
public class Lab4_CW3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        for(;;)
        {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            if (n>0)
            {
                int prod = n*n;
                System.out.println(prod);
            }
            if (n<0)
            {
                break;
            }
        }
    }
}