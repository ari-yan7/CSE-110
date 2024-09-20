/* Take an integer N input from the user and create an integer array of N numbers by
taking inputs from the user. Then, print the array. Next, modify the array by
changing the positive numbers by 1 and the negative numbers by 0. If the element
is zero, then it will be unchanged. Lastly, print the modified array.

Sample Input
N = 4
3
4
-2
1

Sample Output
Original array:
3 4 -2 1
After modifying:
1 1 0 1 
*/

import java.util.Scanner;
public class Lab8_EV1
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  int pos = 1;
  int neg = 0;
  System.out.println("Enter the length of the array:");
  int N = sc.nextInt();
  int[]array = new int [N];
  for (int i = 0; i<N; i++)
  {
   System.out.println("Enter a number:");
   array[i]=sc.nextInt();
  }
  System.out.println("Original array:");
  for (int i = 0; i<N; i++)
  {
   System.out.print(array[i]+" "); 
  }
  System.out.println();
  System.out.println("After modifying: ");
  for (int i = 0; i<array.length; i++)
  {
   if (array[i]>0)
   {
    array[i]=pos;
   }
   if (array[i]<0 || array[i]==0)
   {
    array[i]=neg;
   }
   System.out.print(array[i]+" ");
  }
 }
}