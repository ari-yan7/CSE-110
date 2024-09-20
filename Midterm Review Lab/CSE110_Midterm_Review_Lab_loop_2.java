/*Write Java code of a program that asks the user the value n as input and then
prints the value of y. Hint: Every 4th term is a negative number.

 y=1+½+⅓–¼+⅕+⅙+1/7-⅛+…..1/n
 
 SampleInput
 4
 
 SampleOutput
 Y=1.5833
 
 Explanation:Theresult iscalculatedaccordingtotheformula.

*/

import java.util.Scanner;
public class CSE110_Midterm_Review_Lab_loop_2
{
 public static void main (String[]args)
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter N:");
  int n=sc.nextInt();
  double sum=0.0;
  for(int a=1; a<=n; a++)
  {
   if (a%4!=0)
   {
    sum+=1.0/a;
   }
   else 
   {
     sum-=1.0/a;
   }
  }
  System.out.println(sum);
 }
}