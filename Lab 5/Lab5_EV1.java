/*Write a Java code of a program that reads the value of N from the user and calculates the
value of y if the expression of y is as follows:
? = ? (1) ? (1 + 2) ? (1 + 2 + 3) ? . . . . ? (1 + 2 + 3 + . . . + ?) 

 Sample Input:
 The value of N: 2
 Sample Output:
 The value of y:-4

*/

import java.util.Scanner;
public class Lab5_EV1
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter N:");
  int N=sc.nextInt();
  int y=0;
  int count=1;
  while (count<=N)
  {
   int sum=0;
   int a=1;
   while (a<=count)
   {
    sum+=a;
    a++;
   }
   y+=sum;
   count++;
  }
  y=-y;
  System.out.println(y);
 }
}