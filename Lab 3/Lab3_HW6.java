/*write a java program that takes 3 float numbers as input from the user and
prints the maximum and minimum number from the inputs.*/

import java.util.Scanner;
public class Lab3_HW6
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st Number");
   double a=sc.nextDouble();
   
   System.out.println("Enter 2nd Number");
   double b=sc.nextDouble();
   
   System.out.println("Enter 3rd Number");
   double c=sc.nextDouble();
   
   if ((a>b)&&(a>c))
   {
     System.out.println("Maximum number is"+a);
   }
   else if ((b>a)&&(b>c))
   {
     System.out.println("Maximum number is"+b);
   }
   else if ((c>a)&&(c>b))
   {
     System.out.println("Maximum number is"+c);
   }
   if ((a<b)&&(a<c))
   {
     System.out.println("Minimum number is"+a);
   }
   else if ((b<a)&&(b<c))
   {
     System.out.println("Minimum number is"+b);
   }
   else if ((c<a)&&(c<b))
   {
     System.out.println("Minimum number is"+c);
   }
  }
}