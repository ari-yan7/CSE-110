/*Take the height of a hollow isosceles triangle from the user and create the triangle
according to the output below. Your output should match the specified output.
Sample Input #1
4

Output
   1
  1 3
 1   5
1234567
*/

import java.util.Scanner;
public class Lab6_HW5
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Height");
  int h=sc.nextInt();
  for (int i=1; i<=h; i++)
  {
   for (int j=i; j<h; j++)
   {
    System.out.print(" "); 
   }
   for (int a=1; a<=((2*i)-1); a++)
   {
    if (i==1 || i==h)
    {
     System.out.print(a);
    }
    else
    {
     if (a==1 || a==((2*i)-1))
     {
      System.out.print(a);
     }
     else 
     {
      System.out.print(" "); 
     }
    }
   }
   System.out.println();
  }
 }
}