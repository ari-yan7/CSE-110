/* Write a Java program that will take an integer as input and print all the divisors of that number.
 Sample Input
 6
 Sample Output
 Divisors of 6:
 1
 2
 3
 6
*/

import java.util.Scanner;
public class Lab4_EV1
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.printf("Divisors of %d:",n);
        System.out.println();
        for (int i = 1; i<=n; i++)
        {
            int div = n%i;
            if (div==0)
            {
                System.out.println(i);
            }
        }
    }
}