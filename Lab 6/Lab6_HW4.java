/*Take the height of a left-justified hollow right triangle from the user and create the
triangle according to the output below. Your output should match the specified output.
Sample Input #1
5

Output
1
1 2
1   3
1     4
1 2 3 4 5
*/

import java.util.Scanner;
public class Lab6_HW4
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter height");
  int h=sc.nextInt();
  for (int i=1; i<h; i++)
  {
   System.out.print(1+" ");
   for (int j=2; j<i; j++)
   {
    System.out.print("  ");
   }
   if (i>1 && i<h)
   {
    System.out.print(i); 
   }
   System.out.println();
  }
  for (int i=1; i<=h; i++)
  {
   System.out.print(i+" "); 
  }
  System.out.println();
 }
}