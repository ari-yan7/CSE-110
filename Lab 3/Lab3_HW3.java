/*Let’s consider the following piecewise function: 
f(x)=2x if (x<0), 
x+1 if (0<=x<2), 
x^2-1 if (2<=x<5), 
3*x^2 +2 if (x>=5).
 write a Java code of a program that takes the value of x as
user input and then displays the output based on the given piecewise function. */

import java.util.Scanner;
public class Lab3_HW3
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner (System.in);
  System.out.print("x=");
  int x=sc.nextInt();
  if (x<0)
  {
   System.out.println("output:"+(2*x)); 
  }
   else if ((0<=x)&&(x<2))
  {
   System.out.println("output:"+(x+1)); 
  }
  else if ((2<=x)&&(x<5))
  {
   System.out.println("output:"+((x*x)-1));
  }
  else if (x>=5)
  {
   System.out.println("output:"+((3*x*x)+2)); 
  }
 }
}