/* Write a Java program that asks the user the length of an array then takes that many
integer numbers as elements for the array as input. Then the program asks the user
to enter the target value. The program should add exactly two elements of the
array to find the target value and their corresponding indices. The program should
print the combination of elements that add up to give the target value and its
corresponding index. If the target value does not exist, print “Target value not
found”. [Only consider the first pair if multiple pairs exist.]

Sample Input - 1 
Please enter the length of array: 5
Please enter the elements of the array:
3
8
5
4
1
Please enter the target value:
9

Sample Output - 1
Elements need to be added: 8 1
Index of the elements: 1 and 4 

Sample Input - 2 
Please enter the length of array: 4
Please enter the elements of the array:
3
6
4
1
Please enter the target value:
6 

Sample Output - 2 
Target value not found
*/

import java.util.Scanner;
public class Lab8_HW4
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Please enter the length of array:");
  int n = sc.nextInt();
  int[]array = new int [n];
  System.out.println("Please enter the elements of the array: ");
  for (int i = 0; i<n; i++)
  {
   array[i]=sc.nextInt();
  }
  System.out.println("Please enter the target value: ");
  int t = sc.nextInt();
  int i,j;
  for (i = 0; i<n; i++)
  {
   for (j = i+1; j<n; j++)
   {
    if (array[i]+array[j]==t)
    {
     System.out.println("Elements need to be added: "+array[i]+" "+array[j]);
     System.out.println("Index of the elements: "+i+" and "+j);
     i=n;
     break;
    }
   }
  }
  if (i<=n)
  {
   System.out.println("Target value not found");
  }
 }
}