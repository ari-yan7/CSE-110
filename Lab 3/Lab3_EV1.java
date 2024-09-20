/* Write the Java code of a program to find the smallest among three different numbers
 entered by the user.
*/

import java.util.Scanner;
public class Lab3_EV1
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a<b)&&(a<c))
        {
            System.out.println("Smallest number: "+a);
        }
        if ((b<a)&&(b<c))
        {
            System.out.println("Smallest number: "+b);
        }
        if ((c<a)&&(c<b))
        {
            System.out.println("Smallest number: "+c);
        }
    }
}