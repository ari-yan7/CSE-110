/* Write a method called oneToN that prints 1 till N recursively.
Hint: N is a number taken as input from the user and you need to print the
numbers starting from 1 to N recursively.

Sample Input 
N=11

Sample Method Call
oneToN(1,N); 

Output
1 2 3 4 5 6 7 8 9 10 11

*/

import java.util.Scanner;
public class Lab9_HW4
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.print("N = ");
  int N = sc.nextInt();
  oneToN(1,N);
 }
 public static void oneToN(int start,int N)
 {
  for (int i = 1; i<=N; i++)
  {
   System.out.print(i+" "); 
  }
 }
}