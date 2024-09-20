/*Take the length and width of a hollow rectangle from the user and create the rectangle
according to the output below. Your output should match the specified output.
Sample Input #1
6
4
Output
1 2 3 4 5 6
1         6
1         6
1 2 3 4 5 6
*/

import java.util.Scanner;
public class Lab6_HW3
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter width");
  int w=sc.nextInt();
  System.out.println("Enter height");
  int h=sc.nextInt();
  for (int i=1; i<=w; i++)
  {
   System.out.print(i+" ");
  }
  System.out.println();
  
  for (int j=2; j<h; j++)
  {
   System.out.print(1+" ");
   for (int i=2; i<w; i++)
   {
     System.out.print("  ");
   }
   System.out.println(w);
  }
  for (int i=1; i<=w; i++)
  {
   System.out.print(i+" ");
  }
 }
}