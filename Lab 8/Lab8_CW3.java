/* Write a Java program that asks the user for the length of an array and then
creates an integer array of that length by taking inputs from the user. Then,
a. Reverse the array by creating a new array of the same length and print it.
(Out-of Place)
b. Reverse the array without creating any new arrays and print it. (In-Place) 

Sample Input
Enter the length of the array: 5
Enter a number: 7
Enter a number: -31
Enter a number: 344
Enter a number: 97
Enter a number: 100 

Sample Output
Reversed using a new array:
100 97 344 -31 7
Reversed the original array:
100 97 344 -31 7
*/

import java.util.Scanner;
public class Lab8_CW3
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter the length of the array:");
  int n = sc.nextInt();
  int[]array = new int [n];
  for (int i = 0; i<n; i++)
  {
   System.out.println("Enter a number:");
   array[i]=sc.nextInt();
  }
  int[]new_array=new int [n];
  for (int i = 0; i<n; i++)
  {
   new_array[i]=array[i];
  }
  System.out.println("Reversed using a new array:");
  for (int i = new_array.length-1; i>=0; i--)
  {
   System.out.print(new_array[i]+" ");
  }
  System.out.println();
  System.out.println("Reversed the original array: ");
  for (int i = array.length-1; i>=0; i--)
  {
   System.out.print(array[i]+" ");
  }
 }
}