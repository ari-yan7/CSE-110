/* Take an integer N input from the user and create an array of length N by taking the
elements as user input. Then, print the array. Next, sort the array in descending
order using Selection Sort technique. Lastly, print the sorted array.

Sample Input 
N = 6
Enter a number: 3
Enter a number: 6
Enter a number: 1
Enter a number: 2
Enter a number: 8
Enter a number: 5

Sample Output
Original Array:
3 6 1 2 8 5
Sorted Array:
8 6 5 3 2 1
*/

import java.util.Scanner;
public class Lab8_HW5
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.print("N = ");
  int n = sc.nextInt();
  int[]array = new int [n];
  for (int i = 0; i<n; i++)
  {
   System.out.print("Enter a number:");
   array[i]=sc.nextInt();
  }
  System.out.println("Original Array:");
  for (int i = 0; i<n; i++)
  {
   System.out.print(array[i]+" "); 
  }
  for (int i = 0; i<array.length; i++)
  {
   int max_index = i;
   for (int j = i+1; j<array.length; j++)
   {
    if (array[j]>array[max_index])
    {
     max_index=j;
    }
   }
   int temp = array[max_index]; 
   array[max_index]=array[i]; 
   array[i]=temp;
  }
  System.out.println();
  System.out.println("Sorted Array:");
  for (int i = 0; i<array.length; i++)
  {
   System.out.print(array[i]+" "); 
  }
 }
}