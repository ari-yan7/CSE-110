/*Suppose you are hired by Swapno. Now, your task is to create a java program that will
help the cashier calculate the change to be returned.
The program takes two inputs. First input is an integer number which is the amount of
money to be paid in taka and the second integer is the amount of money the customer
gave to the cashier. Your program should print the following:
- If the customer gave more money than the actual amount, print change the cashier
should return in notes and coins.
- If the customer gave less money than the amount to be paid, then print the amount
the customer needs to pay.
-
Consider the following denomination for notes and coins in taka:
Notes: 100, 50, 20, 10.
Coins: 5, 2, 1. */

import java.util.Scanner;
public class Lab3_HW7
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the amount the customer need to pay(Taka)");
   int a=sc.nextInt();
   
   System.out.println("Enter the amount, customer gave(Taka)");
   int b=sc.nextInt();
   
   int r=b-a;
   int s=a-b;
   
   int c=r/100;
   int d=r%100;
   
   int e=d/50;
   int f=d%50;
   
   int g=f/20;
   int h=f%20;
   
   int i=h/10;
   int j=h%10;
   
   int k=j/5;
   int l=j%5;
   
   int m=l/2;
   int n=l%2;
   
   int o=n/1;
   
   if (r==0)
   {
    System.out.println("The returned amount is 0 taka"); 
   }
   
   else if (r<0)
   {
    System.out.println("Please pay"+s+"taka more"); 
   }
   
   else if (r>0)
   {
   System.out.println("The returned amount is"+r+"taka");
   
   System.out.println("100 taka note:"+c);
   
   System.out.println("50 taka note:"+e);
   
   System.out.println("20 taka note:"+g);
   
   System.out.println("10 taka note:"+i);
   
   System.out.println("5 taka coin:"+k);
   
   System.out.println("2 taka coin:"+m);
   
   System.out.println("1 taka coin:"+o);
  }
  }
}