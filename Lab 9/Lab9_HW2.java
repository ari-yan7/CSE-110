/*A. Write a simple method called showDots that takes a number as an argument
and then prints that amount of dots inside the method.
Note: You can use System.out.print() to avoid the next output being
printed on the next line. 

Sample Method Call
showDots(5);

Sample Output 
.....

B. Write a method called show_palindrome that takes a number as an
argument and then prints a palindrome inside the method.
Note: You can use System.out.print() to avoid the next output being
printed on the next line

Sample Method Call 
show_palindrome(5)

Sample Output 
123454321

C. Write a method called showDiamond that takes an integer number as an
argument and then prints a palindromic diamond shape. Moreover, the
empty spaces surrounding the diamonds are filled with dots(.) .
Note: You must call the methods written in task HW-2A & HW-2B,
otherwise this task would be considered invalid.

Sample Method Call 
showDiamond(5) 

Sample Output 
....1....
...121...
..12321..
.1234321.
123454321
.1234321.
..12321..
...121...
....1....
*/

import java.util.Scanner;
public class Lab9_HW2
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Your Number:");
  int num = sc.nextInt();
  String dots = showDots(num);
  String palindrome = show_palindrome(num);
  System.out.println(dots);
  System.out.println(palindrome);
  showDiamond(num);
 }
 public static String showDots(int num)
 {
  String dots = "";
  for (int i = 1; i<=num; i++)
  {
   dots+="."; 
  }
  return dots;
 }
 public static String show_palindrome(int num)
 {
  String s1 = "";
  for (int i = 1; i<=5; i++)
  {
   s1+=i; 
  }
  for (int i = num-1; i>=1; i--)
  {
   s1+=i; 
  }
  return s1;
 }
 public static void showDiamond(int num)
 {
  for (int i=1; i<=num; i++)
  {
   for (int j=1; j<=num-i; j++)
   {
    System.out.print("."); 
   }
   for (int j=1; j<=i; j++)
   {
    System.out.print(j);
   }
   for (int j=i-1; j>=1; j--)
   {
    System.out.print(j); 
   }
   for (int j=1; j<=num-i; j++)
   {
    System.out.print("."); 
   }
   System.out.println();
  }
  for (int i = num - 1; i >= 1; i--) 
  {
   for (int j = 1; j <= num - i; j++) 
   {
    System.out.print(".");
   }
   for (int j = 1; j <= i; j++) 
   {
    System.out.print(j);
   }
   for (int j = i - 1; j >= 1; j--) 
   {
    System.out.print(j);
   }
   for (int j = 1; j <= num - i; j++) 
   {
    System.out.print(".");
   }
   System.out.println(); 
  }
 }
}