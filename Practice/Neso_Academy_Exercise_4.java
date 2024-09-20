/*Write a program which reads a sequence of positive integers.
 The program stops when the user fills a negative value and
 shows the maximum and the minimum of these numbers*/

import java.util.Scanner;
public class Neso_Academy_Exercise_4
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   int n=sc.nextInt();
   int max=n;
   int min=n;
   
   while (true)
   {
    System.out.println("Enter another number:");
    n=sc.nextInt();
    
    if (n<0)
    {
     break; 
    }
    if (n>max)
    {
     max=n; 
    }
    if (n<min)
    {
     min=n; 
    }
   }
   System.out.println("Maximum= "+max);
   System.out.println("Minimum= "+min);
 }
}