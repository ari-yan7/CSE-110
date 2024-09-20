/* Write a Java program that will take N integer numbers from the user and create an
array of length N.
a. Print the elements of the array with their indices.
b. Take another integer input from the user, resize the array by length 1, and
add the new integer value to the array. Print the resized array. 

Sample Input
N = 5
Enter a number: 11
Enter a number: 22
Enter a number: 33
Enter a number: 44
Enter a number: 55
Enter another number: 101 

Sample Output
The elements of the array are:
0: 11
1: 22
2: 33
3: 44
4: 55
After resizing the array:
11 22 33 44 55 101
*/

import java.util.Scanner;
public class Lab8_CW1
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter the length of the array:");
  int n = sc.nextInt();
  int[]array = new int [n];
  for (int i = 0; i<n; i++)
  {
   System.out.print("Enter a number: ");
   array[i]=sc.nextInt();
  }
  System.out.println("The elements of the array are:");
  for (int i = 0; i<n; i++)
  {
   System.out.println(i+" : "+array[i]);
  }
  int[]new_array=new int [n+1];
  System.out.print("Enter another number: ");
  int new_num = sc.nextInt();
  for (int i = 0; i<n; i++)
  {
   new_array[i]=array[i];
  }
  new_array[n]=new_num;
  System.out.println("After resizing the array:");
  for (int i = 0; i<new_array.length; i++)
  {
   System.out.print(new_array[i]+" ");
  }
 }
}