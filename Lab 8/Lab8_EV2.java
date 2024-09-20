/* Write a Java program that will take N integer numbers from the user and create an
array of length N. Take another number from the user and print the index of the
number where it is found first. If not found then print ‘Element not found’.
Note: Think about how to apply the concept of flag and break in this task. 

Sample Input 1 
N = 7
Enter a number: 45
Enter a number: 0
Enter a number: 17
Enter a number: 11
Enter a number: -34
Enter a number: -100
Enter a number: 17
17

Sample Output 1
17 is at index 2 

Sample Input 2
N = 5
Enter a number: 4
Enter a number: 99
Enter a number: 23
Enter a number: -67
Enter a number: 34
55

Sample Output 2
Element not found
*/

import java.util.Scanner;
public class Lab8_EV2
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter the length of the array:");
  int N = sc.nextInt();
  int[]array = new int [N];
  for (int i = 0; i<N; i++)
  {
   System.out.println("Enter a number:");
   array[i]=sc.nextInt();
  }
  System.out.println("Enter a number to find:");
  int num = sc.nextInt();
  for (int i = 0; i<array.length; i++)
  {
   if (array[i]==num)
   {
    System.out.printf("%d is at index %d",num,i);
    break;
   }
   if (i==array.length-1 && array[i]!=num)
   {
    System.out.println("Element not found");
   }
  }
 }
}