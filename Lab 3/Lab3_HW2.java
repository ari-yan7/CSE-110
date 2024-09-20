/*write a Java code of a program that takes an integer
number as user input and then determines if that number is divisible by both 5 and 7;
otherwise display “No”. For example, numbers like 35, 70, 105, 140, 175, 210, 245, 280
etc. can be divisible by both 5 and 7.
*/

import java.util.Scanner;
public class Lab3_HW2
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner (System.in);
  
  System.out.println("Enter an integer");
  
  int a=sc.nextInt();
  
  if ((a%5==0)&&(a%7==0))
  {
    System.out.println("Divisible by both");
  }
  else if ((a%5==0)&&(a%7!=0))
  {
   System.out.println("Invalid: Divisible by 5 Only"); 
  }
  else if ((a%5!=0)&&(a%7==0))
  {
   System.out.println("Invalid: Divisible by 7 Only"); 
  }
  else 
  {
   System.out.println("No"); 
  }
 }
}