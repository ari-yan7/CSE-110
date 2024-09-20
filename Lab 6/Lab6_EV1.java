/*  Take the length of a square from the user and create the square according to the output
 below. Your output should match the specified output.
  Sample Input
 4
  Output
 1234
 1234
 1234
 1234
*/

import java.util.Scanner;
public class Lab6_EV1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}