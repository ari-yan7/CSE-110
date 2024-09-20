/*Write a program which reads a positive number N
 from the user then indicates if N is prime or not.
 N is a prime number if its divisors are only 1 and N*/

import java.util.Scanner;
public class Neso_Academy_Exercise_3
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int N=sc.nextInt();
  int sum=0;
  for(int i=2; i<N; i++)
  {
   if (N%i==0)
   {
    sum+=i;
   }
  }
   if (sum==0)
   {
    System.out.println("Prime number");
   }
   else
   {
     System.out.println("Not a prime number");
   }
  }
 }