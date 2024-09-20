/*write a Java program that will take a positive integer n as input and print
all the numbers between 0 to n which are divisible by 5 but not divisible by 3. */

import java.util.Scanner;
public class Lab4_HW3
{
 public static void main(String[]args)
 {
  System.out.println("Enter number");
   Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int num=0;
  while(num<=a)
  {
   if (num%5==0 && num%3!=0)
   {
    System.out.println(num);
   }
   num=num+1;
  }
 }
}