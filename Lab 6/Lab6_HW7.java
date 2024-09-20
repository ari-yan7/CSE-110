/*Take the vertical diagonal length of a hollow rhombus from the user and create the
triangle according to the output below. Your output should match the specified output. 
Sample Input #1
4

Output
      1
    1   3
  1       5
1           7
  1       5
    1   3
      1
      */

import java.util.Scanner;
public class Lab6_HW7
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
    System.out.print(" ");
   }
   for (int a=1; a<=2*i-1; a++)
   {
    if (a==1 || a==2*i-1)
    {
     System.out.print(a);  
    }
    else
    {
     System.out.print(" "); 
    }
   }
   System.out.println();
  }
  for (int i=1; n>i; i++)
  {
   for (int j=1; j<=i; j++)
   {
    System.out.print(" ");
   }
   for (int a=1; a<=2*(n-i)-1; a++)
   {
    if (a==1 || a==2*(n-i)-1)
    {
     System.out.print(a);
    }
    else
    {
     System.out.print(" "); 
    }
   }
   System.out.println();
  }
 }
}