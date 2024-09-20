/*Write a program which displays the sum of the
 strict divisors of an integer given by the user*/

import java.util.Scanner;
public class Neso_Academy_Exercise_2
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int N=sc.nextInt();
   int sum=0;
   int i=1;
  for (i =1; i<N; i++)
  {
   if (N%i==0)
   {
    System.out.print(i+" ");
     sum+=i; 
   }
  }
  System.out.println(sum);
 }
}