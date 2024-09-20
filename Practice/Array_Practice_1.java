/* Given an array of integers, write a program to find the maximum element in the array.
Given Array 1
{5, 2, 8, 3, 9}
Sample Output 2
9
*/

public class Array_Practice_1
{
 public static void main (String[]args)
 {
  int a[] = {5,2,8,3,9};
  int c = 0;
  for (int i = 0; i<a.length; i++)
  {
   if (a[i]>c)
   {
     c = a[i]; 
   }
  }
  System.out.println(c);
 }
}