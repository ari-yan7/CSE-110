/* Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
*/

import java.util.Scanner;
public class Method_Practice_2
{
    public static double avg (int a, int b, int c)
    {
        return (a + b + c) / 3.0;
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input the first number: ");
        int a = sc.nextInt();
        System.out.println("Input the second number: ");
        int b = sc.nextInt();
        System.out.println("Input the third number: ");
        int c = sc.nextInt();
        System.out.println("The average value is " + avg(a, b, c));
    }
}