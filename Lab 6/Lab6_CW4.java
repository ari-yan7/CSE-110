/*  Take the height of an isosceles triangle from the user and create the triangle according to
 the output below. Your output should match the specified output.
 Sample Input#1
 4
 Output
   1
  123
 12345
1234567
*/

import java.util.Scanner;
public class Lab6_CW4
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int h = sc.nextInt();
        for (int i = 0; i<=h; i++)
        {
            for (int j = i; j<h; j++)
            {
                if (j==0)
                {
                    break;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            for (int j = i+1; j<=(i+(i-1)); j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}