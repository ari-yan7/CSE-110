/*Write a program in Java that asks the user for an integer input and counts the number of digits
in the number.
Hint: You may keep dividing the number by ten and count how many times this can be done
until the number becomes 0.*/

import java.util.Scanner;
public class Lab4_HW4
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int a=sc.nextInt();
  int count=0;
  while (a>0)
  {
   a=a/10;
   count++;
  }
  System.out.println("Total digits= "+count);
 }
}