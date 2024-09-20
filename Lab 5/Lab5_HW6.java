/*Write a Java program that will ask the user to specify a range, indicating the starting and
ending numbers for generating a times table. The program will generate and display the
times table for the specified numbers.

 SampleInput:
 Start:3
 Stop:5
 
 SampleOutput:
 TimesTableof3:
 3x1=3
 3x2=6
 ........
 3x10=30
 TimesTableof4:
 4x1=4
 4x2=8
 .........
 4x10=40
 TimesTableof5:
 5x1=5
 5x2=10
 ..........
 5x10=50

*/

import java.util.Scanner;
public class Lab5_HW6
{
 public static void main (String[]args)
 {
  Scanner sc= new Scanner (System.in);
  System.out.println("Start: ");
  int start=sc.nextInt();
  System.out.println("Stop: ");
  int stop=sc.nextInt();
  int result=0;
  while (start<=stop)
  {
   System.out.printf("Times Table of %d:",start);
   System.out.println();
   for (int product=1; product<=10; product++)
   {
    result=start*product;
    System.out.printf("%d x %d = %d",start,product,result);
    System.out.println();
   }
   start++;
  }
 }
}