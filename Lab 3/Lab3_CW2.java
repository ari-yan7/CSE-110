/* Write a Java program that takes a student's numerical score as input as an integer and
 prints their corresponding letter grade according to the following grading system:
 Scores   90-100    85-89   70-84   57-69   50-56   <50
 Grades     A         A-      B       C       D      F

 Sample Input
 82
 Output
 Your grade is B
*/

import java.util.Scanner;
public class Lab3_CW2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if ((num<=100)&&(num>=90))
        {
            System.out.println("Your grade is A");
        }
        if ((num<=89)&&(num>=85))
        {
            System.out.println("Your grade is A-");
        }
        if ((num<=84)&&(num>=70))
        {
            System.out.println("Your grade is B");
        }
        if ((num<=69)&&(num>=57))
        {
            System.out.println("Your grade is C");
        }
        if ((num<=56)&&(num>=50))
        {
            System.out.println("Your grade is D");
        }
        if ((num<50)&&(num>=0))
        {
            System.out.println("Your grade is F");
        }
        else if ((num<0)&&(num>100))
        {
            System.out.println("Invalid Input");
        }
    }
}