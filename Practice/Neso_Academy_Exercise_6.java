/*Writing a program that reads an integer n and displays the nth Fibonacci number.*/

import java.util.Scanner;
public class Neso_Academy_Exercise_6
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner (System.in);
  int n = sc.nextInt();
  int count=3;
  int a=1;
  int b=1;
  int result=a+b;
  if (n==1)
  {
   System.out.println(a); 
  }
  else if (n==2)
  {
   System.out.println(b);
  }
  else
  {
  while (count<=n)
  {
   result=a+b;
   a=b;
   b=result;
   count++;
  }
  System.out.println(result);
  }
 }
}