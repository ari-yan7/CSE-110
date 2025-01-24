/*  Take the height of a right-justified right triangle from the user and create the triangle
 according to the output below. Your output should match the specified output.

 Sample Input#1
 4
 Output
       4
     3 4
   2 3 4
 1 2 3 4
*/

import java.util.Scanner;
public class Lab6_CW3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = n; i>0; i--)
        {
            for (int k = n-i+1; k<n; k++)
            {
                System.out.print("  ");
            }
            for (int j = i; j<=n; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
