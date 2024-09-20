/* Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
*/

import java.util.Scanner;
public class Method_Practice_1
{
    public static int small (int a, int b, int c)
    {
        if(a <= b && a <= c)
        {
            return a;
        }
        else if(b <= a && b <= c)
        {
            return b;
        }
        else
        {
            return c;
        }    
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = sc.nextInt();
        System.out.println("Input the Second number: ");
        int b = sc.nextInt();
        System.out.println("Input the Third number: ");
        int c = sc.nextInt();
        System.out.println("The smallest value is "+small(a,b,c));
    }
}