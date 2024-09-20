/* Atriangle has 3 sides. Write a program which asks the users for input. Based on the
 input, your program should output whether it is an Equilateral, Isosceles or Scalene.
 ● Equilateral triangle has three sides with equal length
 ● Isosceles triangle has exactly two sides with equal length and another side is
 different
 ● Scalene triangle has different lengths in each side

 Sample Input
 5
 2
 4
 Output
 This is a Scalene triangle

 Sample Input
 5
 5
 3
 Output
 This is a Isosceles triangle

 Sample Input
 3
 3
 3
 Output
 This is a Equilateral triangle
*/

import java.util.Scanner;
public class Lab3_CW4
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a==b)&&(b==c)&&(c==a))
        {
            System.out.println("This is a Equilateral triangle");
        }
        else if ((a!=b)&&(b!=c)&&(c!=a))
        {
            System.out.println("This is a Scalene triangle");
        }
        else
        {
            System.out.println("This is a Isosceles triangle");
        }
    }
}