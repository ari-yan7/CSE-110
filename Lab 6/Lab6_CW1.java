/*Take the length and width of a rectangle from the user and create the rectangle according
to the output below. Your output should match the specified output.
Sample Input #1
4
6
Output
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
*/

import java.util.Scanner;
public class Lab6_CW1
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
   int num=1;
   while (num<=column)
   {
    System.out.print(num+" ");
    num++;
   }
   System.out.println();
   row_count++;
  }
 }
}