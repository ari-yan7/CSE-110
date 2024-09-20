/*Write a Java program that will ask the user for the first value, change, and last
value of an arithmetic series, and then print the series.

 SampleInput
 10
 20
 134
 
 SampleOutput
 10,30,50,70,90,110,130

*/

import java.util.Scanner;
public class CSE110_Midterm_Review_Lab_loop_1
{
 public static void main(String[]args)
 {
  Scanner sc =new Scanner(System.in); 
  System.out.print("Enter the first value");
  int a=sc.nextInt();
  System.out.print("Enter the change");
  int b=sc.nextInt();
  System.out.print("Enter the last value");
  int c=sc.nextInt();
  
  for (int n=a; n<c; n+=b)
  {
   if (a==n)
   {
    System.out.print(n); 
   }
   else
   {
    System.out.print(","+n);
   }
  }
 }
}