/* You are given an integer array with duplicate values. Write a Java program to
update the array by replacing the duplicate values of the array with zero. Then print the
updated array. [Your code should work for any given integer array]

Given Array
int arr [] = {9, -5, 7, 9, -5, 5, 7};

Sample Output 
Before removing duplicates:
9 -5 7 9 -5 5 7
After replacing duplicates with 0:
9 -5 7 0 0 5 0
*/

public class Lab8_CW2
{
 public static void main (String[]args)
 {
  int arr [] = {9,-5,7,9,-5,5,7};
  int replace = 0;
  System.out.println("Before removing duplicates:");
  for (int i = 0; i<arr.length; i++)
  {
   System.out.print(arr[i]+" "); 
  }
  System.out.println();
  System.out.println("After replacing duplicates with 0:");
  for (int i = 0; i<arr.length; i++)
  {
   for (int j = i+1; j<arr.length; j++)
   {
    if (arr[i]==arr[j])
    {
     arr[j]=replace;
    }
   }
   System.out.print(arr[i]+" ");
  }
 }
}