/*Write a java code that will calculate the value of y if the expression of y is as follows (n is
the input):
y=1^2-2^2+3^2-4^2+5^2.........+n^2*/

import java.util.Scanner;
public class Loop_Practice_2
{
 public static void main(String[]args)
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the value of n");
  int a=sc.nextInt();
  int i=1;
  int sum=0;
  while (i<=a)
  {
    if (i%2==1)
    {
     sum+=Math.pow(i,2);
    }
    else if (i%2==0)
    {
     sum-=Math.pow(i,2); 
    }
   i++;
  }
  System.out.println(sum);
 }
}