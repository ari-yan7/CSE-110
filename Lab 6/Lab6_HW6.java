/*Take the vertical diagonal length of a rhombus from the user and create the triangle
according to the output below. Your output should match the specified output.
Sample Input #1
4

Output
      1
    1 2 3
  1 2 3 4 5
1 2 3 4 5 6 7
  1 2 3 4 5
    1 2 3
      1
      */

import java.util.Scanner;
public class Lab6_HW6
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number");
  int n=sc.nextInt();
  for (int i=1; n>=i; i++)
  {
   for (int j=1; j<=n-i; j++)
   {
    System.out.print("  ");
   }
   for (int a=1; a<=2*i-1; a++)
   {
    System.out.print(a+" ");  
   }
   System.out.println();
  }
  for (int i=1; n>i; i++)
  {
   for (int j=1; j<=i; j++)
   {
    System.out.print("  ");
   }
   for (int a=1; a<=2*(n-i)-1; a++)
   {
    System.out.print(a+" ");
   }
   System.out.println();
  }
 }
}