/* You are given an integer array. You need to create a new array that will contain
only the unique elements of the given array. Finally, print the new array.

Sample Input
int arr [] = {23,100,23,56,100};

Sample Output 
Input array:
23 100 23 56 100
New array:
23 100 56
*/

public class Lab8_HW2
{
 public static void main (String[]args)
 {
  int arr [] = {23,100,23,56,100};
  int replace = 0;
  System.out.println("Input array: ");
  for (int i = 0; i<arr.length; i++)
  {
   System.out.print(arr[i]+" "); 
  }
  System.out.println();
  for (int i = 0; i<arr.length; i++)
  {
   for (int j = i+1; j<arr.length; j++)
   {
    if (arr[i]==arr[j])
    {
     arr[j]=replace;
    }
   }
  }
  System.out.println("New array: ");
  for (int i = 0; i<arr.length; i++)
  {
   if (arr[i]!=0)
   {
    System.out.print(arr[i]+" "); 
   }
  }
 }
}