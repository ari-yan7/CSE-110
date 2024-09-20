/* Write a Java program that will take an integer as input and
 a)Find out if the number is a prime number or not.
 b)Find out if the number is a perfect number or not.
 [Prime Number: If a number has only two divisors, (1 and itself), then it is a prime number.
 Else,then it is not a prime number.
 Perfect Number: A number is said to be a perfect number if the sum of its divisors,including 1
 but not the number itself is equal to that number.]
 Sample Input
 6
 Sample Output
 6 is not a prime number
 6 is a perfect number
*/

import java.util.Scanner;
public class Lab4_HW6
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int div_count = 0;
        for (int i = 1; i<=a; i++)
        {
            if (a%i==0)
            {
                div_count++;
            }
            int div = a/i;
            if (div!=1)
            {
                sum+=i;
            }
        }
        if (div_count==2)
        {
            System.out.printf("%d is a prime number",a);
        }
        if (div_count!=2)
        {
            System.out.printf("%d is not a prime number",a);
        }
        System.out.println();
        if (sum==a)
        {
            System.out.printf("%d is a perfect number",a);
        }
        if (sum!=a)
        {
            System.out.printf("%d is not a perfect number",a);
        }
    }
}