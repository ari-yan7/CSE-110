/*Write a Java code that asks the user for the value of N as input and then prints
the value of Y
y = 3 - 5 + 7 - 9 ….. nth term

SampleInput
5

SampleOutput
7

Explanation: If theusergivesn=1,print3. If theusergivesn=2,print-2. If theuser
 givesn=3,print5andsoon.Forexample, fortheinput5we’lladdupthefirst5
 numbersof theseries,so3-5+7-9+11=7.

*/

import java.util.Scanner;
public class CSE110_Midterm_Review_Lab_loop_3
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();
  int sum=0;
  int num=3;
  int b=1;
  for (int i=0; i<n; i++)
  {
   sum+=num*b;
   num+=2;
   b*=-1;
  }
  System.out.println(sum);
 }
}