/*Write a Java program that will read 10 numbers from the user, and then print the first number,
the sum of the first 2 numbers, the first 3 numbers, and so on up to the sum of 10 numbers.*/

import java.util.Scanner;
public class Lab4_HW2
{
  public static void main (String[]args)
  {
    int count=0;
    int sum=0;
    while(count<=10)
    {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Number:");
     int x=sc.nextInt();
     sum=sum+x;
     System.out.println("Sum="+sum);
     count=count+1;
    }
  }
}