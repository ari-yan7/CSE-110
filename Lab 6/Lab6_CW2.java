/*Take the height of a left-justified right triangle from the user and create the triangle
according to the output below. Your output should match the specified output.
Sample Input #1
4
Output
1
1 2
1 2 3
1 2 3 4
*/

import java.util.Scanner;
public class Lab6_CW2
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter row");
  int row=sc.nextInt();
  int count=1;
  while (count<=row)
  {
   int a=1;
   while (a<=count)
   {
    System.out.print(a+" ");
    a++;
   }
   System.out.println();
   count++; 
  }
 }
}