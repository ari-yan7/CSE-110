/* HomeWork 1
A. Write a method called isPrime which takes an integer in its parameter to
check whether a number is prime or not. If the number is prime then the
method returns boolean true otherwise it returns boolean false.

Sample Input 
boolean check = isPrime(7);
System.out.println(check); 

Sample Output
true

Sample Input
boolean check = isPrime(15);
System.out.println(check); 

Sample Output 
false

B. Write a method called isPerfect which takes an integer in its parameter to
check whether a number is perfect or not. If the number is perfect then the
method returns boolean true otherwise it returns boolean false.

Sample Input
boolean check = isPerfect(6);
System.out.println(check); 

Sample Output
true 

Sample Input
boolean check = isPerfect(33);
System.out.println(check);

Sample Output 
false

C. Write a method called special_sum that calculates the sum of all numbers
that are either prime numbers or perfect up till the integer value given in its
parameter. This integer value must be taken as user input and passed into the
method.
Note: You must call the methods written in task HW-1A & HW-1B,
otherwise this task will be considered invalid.

Sample Input
8

Sample Output 
int result = special_sum(8);
System.out.println(result); 

Output
23

Explanation: Between 1 to 8 the Prime numbers are 2,3,5,7 and
6 is a Perfect number. So, the summation is
2+3+5+7+6=23.
*/

import java.util.Scanner;
public class Lab9_HW1
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter your number:");
  int num = sc.nextInt();
  boolean check = isprime(num);
  System.out.println("Prime: "+check);
  boolean check1 = isperfect(num);
  System.out.println("Perfect: "+check1);
  int result = special_sum(num);
  System.out.println("Special number: "+result);
 }
 public static boolean isprime(int num)
 {
  if (num<=1)
  {
   return false; 
  }
  for (int i = 2; i<=num/2; i++)
  {
   if (num%i==0)
   {
    return false; 
   }
  }
  return true;
 }
 public static boolean isperfect(int num)
 {
  int sum = 0; 
  for (int i = 1; i<num; i++)
  {
   if (num%i==0)
   {
    sum = sum+i; 
   }
  }
  if (num==sum)
  {
   return true; 
  }
  else
  {
   return false; 
  }
 }
 public static int special_sum(int num)
 {
  int sum = 0;
  for (int i = 2; i<=num; i++)
  {
   if (isprime(i)||isperfect(i))
   {
    sum = sum+i; 
   }
  }
  int result = sum;
  return result;
 }
}