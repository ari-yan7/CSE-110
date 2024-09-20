/*  Take the height of a right -justified right triangle from the user and create the triangle
 according to the output below. Your output should match the specified output.
  Sample Input#1
 4
  Output
      1
    1 2
  1 2 3
1 2 3 4
*/

import java.util.Scanner;
public class Lab6_EV2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 0; i<=n; i++)
        {
            for (int j = 0; j<n-i; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k<=i; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}