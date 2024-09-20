/*Draw the flowchart and then write the Java code of a program that calculates the tax and
prints it as follows:
a) No tax if you get paid less than 10,000
b) 5% tax if you get paid between 10,000 and 20,000 (both inclusive)
c) 10% tax if you get paid more than 20,000
d) NO TAX IF YOU ARE LESS THAN 18 YEARS OLD.
Hint: Take payment and age from the user as inputs; then calculate tax and print
it.*/

import java.util.Scanner;
public class Lab3_HW5
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Your Age");
   int a=sc.nextInt();
   
   System.out.println("Enter Your Payment");
   int b=sc.nextInt();
   
   double x=(b*0.05);
   double y=(b*.1);
   
   if ((a>=18)&&(b>=10000)&&(b<=20000))
   {
     System.out.println("Your tax amounts in"+x+"Tk");
   }
   else if ((a>=18)&&(b>20000))
   {
     System.out.println("Your tax amounts in"+y+"Tk");
   }
   else
   {
     System.out.println("Your tax amounts in 0 Tk");
   }
  }
}