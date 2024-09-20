/* Write a Java program that asks the user for the length of an array then creates a
double datatype array of that length by taking inputs from the user.
Then do the following:
a. Show the maximum element and its index from the array.
b. Show the minimum element and its index from the array.
c. Show the summation of all the elements from the array.
d. Show the average of all the elements from the array. 

Sample Input
Enter the length of the array: 5
Enter a number: 7.5
Enter a number: -31.2
Enter a number: 344.0
Enter a number: 97.1
Enter a number: 100.4 

Sample Output
Maximum element 344.0 found at index 2
Minimum element -31.2 found at index 1
Summation: 517.8
Average: 103.56 
*/

import java.util.Scanner;
public class Lab8_HW1
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter the length of the array:");
  int n = sc.nextInt();
  double[]array = new double [n];
  double sum = 0.0;
  double avg = 0.0;
  double max = array[0];
  int max_index = 0;
  //double min = array[0];
  int min_index = 0;
  for (int i = 0; i<n; i++)
  {
   System.out.println("Enter a number:");
   array[i]=sc.nextDouble();
  }
  for (int i = 0; i<n; i++)
  {
   sum+=array[i];
  }
  System.out.println("Summation:"+sum);
  avg = sum/n;
  System.out.println("Average: "+avg);
  for (int i = 0; i<n; i++)
  {
   if (max<array[i])
   {
    max=array[i];
    max_index=i;
   }
  }
  System.out.println("Maximum element "+max+" found at index "+max_index);
  double min = array[0];
  for (int i = 0; i<n; i++)
  {
   if (min>array[i])
   {
    min=array[i];
    min_index=i;
   }
  }
  System.out.println("Minimum element "+min+" found at index "+min_index);
 }
}