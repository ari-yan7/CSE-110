/*  Write a Java program to take a positive integer N as user input and print the first N
 prime numbers starting from 2. Your code should check all the positive integers
 starting from 2 and determine whether they are prime or not until N prime numbers are
 found.
 Sample Input 1:
 5
 Sample Output 1:
 2
 3
 5
 7
 11
*/

import java.util.Scanner;
public class Lab5_CW2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int count = 0;
        for (int i = 2; count<a; i++)
        {
            int div_count = 0;
            for (int j = 1; j<=i ;j++)
            {
                if (i%j==0)
                {
                    div_count++;
                }
            }
            if (div_count==2)
            {
                System.out.println(i);
                count++;
            }
        }
    }
}