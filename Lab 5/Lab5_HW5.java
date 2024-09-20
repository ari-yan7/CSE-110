/*write a Java program to take a positive integer N as user input and
print the first N perfect numbers starting from 2. Your code should check all the
positive integers starting from 2 and determine whether they are prime or not until N
prime numbers are found. 

 SampleInput1:
 2
 SampleOutput1:
 6
 28
 
 SampleInput2:
 3
 SampleOutput2:
 6
 28
 496

*/

import java.util.Scanner;
public class Lab5_HW5
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
    System.out.print("Enter N: ");
    int sum=0;
    int count=0;
    int N = sc.nextInt();
    for (int i=2; i>0; i++)
    {
      sum=0;
      for (int j=1; j<i; j++)
      {
       if (i%j==0)
       {
        sum+=j; 
       }
      }
      if (sum==i)
      {
       System.out.println(i);
       count++;
      }
      if (count==N)
      {
       break;
      }
    }
 }
}