/* Write a function that takes an array of integers as input and returns the sum of all the elements.
Given Array 1
{5, 2, 8, 3, 9}
Sample Output 1
27
*/

public class Array_Practice_2
{
 public static void main (String[]args)
 {
  int a[] = {5,2,8,3,9};
  int c = 0;
  for (int i = 0; i<a.length; i++)
  {
    c+=a[i];
  }
  System.out.println(c);
 }
}