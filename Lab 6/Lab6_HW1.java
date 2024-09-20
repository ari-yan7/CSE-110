/*Take the length and width of a rectangle from the user and create a rectangle according
to the output below. Your output should match the specified output.
Sample Input #1
4
6
Output
4 3 2 1
4 3 2 1
4 3 2 1
4 3 2 1
4 3 2 1
4 3 2 1
*/

import java.util.Scanner;
public class Lab6_HW1
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter column");
  int column=sc.nextInt();
  System.out.println("Enter row");
  int row=sc.nextInt();
  int row_count=1;
  while (row_count<=row)
  {
   int num=column;
   while (num>0)
   {
     System.out.print(num+" ");
     num-=1;
   }
   System.out.println();
   row_count++;
  }
 }
}