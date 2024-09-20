/* Write a Java program that will take N numbers from the user and find their sum and average
 using a for loop.
 Sample Input:
 N=5
 Input the 5 numbers:
 1
 2
 3
 4
 5
 Expected Output:
 The sum of 5 no is:15
 The Average is:3.0
 */

import java.util.Scanner;
 public class Lab4_CW2
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    int sum = 0;
    for (int i = 1; i<=N; i++)
    {
        int a = sc.nextInt();
        sum+=a;
    }
    System.out.printf("The sum of %d no is : %d",N,sum);
    System.out.println();
    double avg = sum/N;
    System.out.println("The average is : "+avg);
  }
}