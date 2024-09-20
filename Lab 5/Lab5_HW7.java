/*Write a Java program that asks the user for a range, a starting number(inclusive) and an
ending number (inclusive). Then, take another input for checking. If the product of all the
digits of each number in the range is divisible by the third input, then print the product.

 SampleInput1:
 25
 30
 4
 SampleOutput1:
 12 16 0

*/

import java.util.Scanner;
public class Lab5_HW7
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Starting Number: ");
  int start=sc.nextInt();
  System.out.print("Enter Ending Number: ");
  int end=sc.nextInt();
  System.out.print("Enter Divisor: ");
  int div=sc.nextInt();
  
  while (start<=end)
  {
    int i=start;
    int product=1;
    while (i!=0)
    {
     int digit = i%10;
     product*=digit;
     i/=10;
    }
    if (product%div==0)
    {
    System.out.print(product+" ");
    System.out.println();
    }
   start++;
  }
 }
}