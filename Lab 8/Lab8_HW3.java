/* Write a Java program that will take input of two arrays and elements from the user
and check whether the second array is a subset of the first array. A subset is a set
that contains only elements found in the original set.

Sample Input - 1 
Please enter the length of array 1: 5
Please enter the elements of the arr1:
5
3
2
72
8
Please enter the length of array 2: 3
Please enter the elements of the arr2:
5
3
72

Sample Output - 1
Array 2 is a subset of Array 1.

Sample Input - 2
Please enter the length of array 1: 5
Please enter the elements of the arr1:
7
2
33
1
6
Please enter the length of array 2: 3
Please enter the elements of the arr2:
1
8
2 

Sample Output - 2
Array 2 is not a subset of Array 1.
*/

import java.util.Scanner;
public class Lab8_HW3
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Please enter the length of array 1:");
  int n1 = sc.nextInt();
  int[]array1 = new int [n1];
  System.out.println("Please enter the elements of the arr1: ");
  for (int i = 0; i<n1; i++)
  {
   array1[i]=sc.nextInt();
  }
  System.out.println("Please enter the length of array 2: ");
  int n2 = sc.nextInt();
  int[]array2 = new int [n2];
  System.out.println("Please enter the elements of the arr2: ");
  for (int i = 0; i<n2; i++)
  {
   array2[i]=sc.nextInt();
  }
  int count = 0;
  for (int i = 0; i<n1; i++)
  {
   for (int j = 0; j<n2; j++)
   {
    if (array1[i]==array2[j])
    {
     count++; 
    }
   }
  }
  if (count==n2)
  {
   System.out.println("Array 2 is a subset of Array 1.");
  }
  else
  {
   System.out.println("Array 2 is not a subset of Array 1.");
  }
 }
}