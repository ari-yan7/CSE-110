/* Write a program which asks the user to enter an integer. Then you have to check
 the input and based on that you have to print the following outputs.
 ● If the input is negative, then print “Number is negative”
 ● If the input is zero, then print “Number is zero”
 ● If the input is positive and even, then print “Number is positive and even”
 ● And if the input is positive and odd, then print “Number is positive and odd”
*/

import java.util.Scanner;
public class Lab3_EV2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if (a<0)
        {
            System.out.println("Number is negative");
        }
        else if (a==0)
        {
            System.out.println("Number is zero");
        }
        else if ((a>0)&&(a%2==0))
        {
            System.out.println("Number is positive and even");
        }
        else
        {
            System.out.println("Number is positive and odd");
        }

    }
}