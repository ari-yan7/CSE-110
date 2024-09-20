/*Write a Java program that reads three numbers and prints "All numbers are equal" if all
three numbers are equal, "All numbers are different" if all three numbers are different and
"Neither all are equal or different" otherwise.*/

import java.util.Scanner;
public class Lab3_HW8
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st Number");
   int a=sc.nextInt();
   
   System.out.println("Enter 2nd Number");
   int b=sc.nextInt();
   
   System.out.println("Enter 3rd Number");
   int c=sc.nextInt();
   
   if ((a!=b)&&(b!=c)&&(c!=a))
   {
    System.out.println("All numbers are different"); 
   }
   else if (((a==b)&&(b!=c))||((b==c)&&(c!=a))||((a==c)&&(a!=b)))
   {
    System.out.println("Neither all are equal or different"); 
   }
   else if ((a==b)&&(b==c)&&(c==a))
   {
    System.out.println("All numbers are equal"); 
   }
  }
}