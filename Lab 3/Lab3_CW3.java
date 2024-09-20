/* Write a java program that will take a year as input and print whether that year is a leap
 year or not.  
 ● A year maybe a leap year if it is evenly divisible by 4.
 ● Years that are divisible by 100 (century years such as 1900 or 2100) cannot be
 leap years unless they are also divisible by 400.  
 
 Sample Input
 2001
 Output
 2001 is not a leap year
*/

import java.util.Scanner;
public class Lab3_CW3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        if ((year%100==0)&&(year%400!=0))
        {
            System.out.println(year+" is not a leap year");
        }
        else if (year%4==0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}