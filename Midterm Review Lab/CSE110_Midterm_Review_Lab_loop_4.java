/*Write a java program that takes an integer number from the user and prints the
value of the pattern given below :
y = -(1) - (1+2) + (1+2+3) + (1+2+3+4) - (1+2+3+4+5) ….. (1+2+3+4….+n)

 SampleInput
 4
 
 SampleOutput
 12

Explanation:Fortheinputn=4we’llcalculateuptothefirst4termsof theseries,
 so-1-3+6+10=12
 
*/

import java.util.Scanner;
public class CSE110_Midterm_Review_Lab_loop_4
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter N: ");
  int n=sc.nextInt();
  int y=0;
  int count=1;
  
  while (count<=n)
  {
   int inner_n=1;
   int sum=0;
   while (inner_n<=count)
   {
    sum+=inner_n;
    inner_n++;
   }
   if (sum%2==0)
   {
    y+=sum; 
   }
   else
   {
    y-=sum; 
   }
  count++;
  }
  System.out.println(y);
 }
}