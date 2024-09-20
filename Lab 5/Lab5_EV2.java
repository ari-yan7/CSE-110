/*Write a Java program that will keep taking even positive integer numbers as inputs from
the user and print the number of divisors of those numbers until it gets an odd number
and then stops.*/

import java.util.Scanner;
public class Lab5_EV2
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  while (true)
  {
   System.out.println("Enter number:");
   int n=sc.nextInt();
   if (n%2!=0)
   {
    break;
   }
   else
   {
    while (true)
    {
     int div_count=0;
     int div=1;
     while (div<=n)
     {
      if (n%div==0)
      {
       div_count++;
      }
      div++;
      }
     System.out.printf("%d has %d divisors",n,div_count);
     System.out.println();
     break;
    }
   }
  }
 }
}