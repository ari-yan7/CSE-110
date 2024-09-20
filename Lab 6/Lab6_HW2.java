/*Take the height of a palindromic isosceles triangle from the user and create the triangle
according to the output below. Your output should match the specified output.
Sample Input #1
4
Output
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
*/

import java.util.Scanner;
public class Lab6_HW2
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter height");
  int h=sc.nextInt();
  for (int i=1; i<=h; i++)
  {
   for (int j=i; j<h; j++)
   {
    System.out.print("  "); 
   }
   for (int j=1; j<=i; j++)
   {
    System.out.print(j);
    if (j<i)
    {
     System.out.print(" "); 
    }
   }
   for (int j=i-1; j>=1; j--)
   {
    System.out.print(" "+j); 
   }
   System.out.println();
  }
 }
}