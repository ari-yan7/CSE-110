/*  Write a Java program that will ask for a range (a starting number and an ending number)
 from the user and print all the Armstrong numbers between that range.
 [Armstrong Number: An Armstrong number is a number whose sum of digits raised to the
 power the number of digits equals to that number.
 For example,371 is an Armstrong number because 3^3+7^3+1^3=371,here the total number of
 digits in 371 is 3]
 Sample Input 1:
 Start:300
 End:500
 Sample Output 1:
 Armstrong numbers:
 370
 371
 407
*/

import java.util.Scanner;
public class Lab5_CW3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        for (int i = start; i<=end; i++)
        {
            int num = i;
            int digit = 0;
            int sum = 0;
            while (num>0)
            {
                num/=10;
                digit++;
            }
            num = i;
            while (num>0)
            {
                int remainder = num%10;
                sum+= Math.pow(remainder,digit);
                num/= 10;
            }
            if (sum==i)
            {
                System.out.println(i);
            }
        }
    }
}