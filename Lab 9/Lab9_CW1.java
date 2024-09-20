/* A. Write a method called evenChecker that takes an integer number as its
argument and prints whether the number is even or odd inside the method

Sample Method Call 
evenChecker(10); 

Sample Output
Even!!

Sample Method Call
evenChecker(17);

Sample Output
Odd!!

B. Write a method called isEven that takes an integer number as an argument
and returns boolean true if the number is even otherwise returns boolean
false. 

Sample Method Call 
boolean result = isEven(10);
System.out.println( result ); 

Sample Output
true

Sample Method Call
boolean result = isEven(17);
System.out.println( result ); 

Sample Output
false

C. Write a method called isPos that takes an integer number as an argument
and returns boolean true if the number is positive otherwise returns
boolean false. 

Sample Method Call
boolean result = isPos(-5);
System.out.println( result );

Sample Output
false

Sample Method Call
boolean result = isPos(12);
System.out.println( result ); 

Sample Output
true

D. Write a method called sequence() that takes an integer in its parameter
called n. Now, if n is positive then it prints all the even numbers from 0 to n,
otherwise if n is negative it prints all the odd numbers from n to -1.
Note: You must call the methods from CW-1B and CW-1C, otherwise this
task would be considered invalid. 

Sample Method Call
sequence(10);

Sample Output
0 2 4 6 8 10

Explanation
Here, 10 is positive so 0,2,4,6,8,10
were printed. 

Sample Method Call
sequence(-7);

Sample Output
-7 -5 -3 -1 

Explanation
Here, -7 is negative so -7,-5,-3,-1
were printed.
*/

public class Lab9_CW1
{
 public static void main (String[]args)
 {
  int num = 10;
  String result1 = evenChecker(num);
  boolean result2 = isEven(num);
  boolean result3 = isPos(num);
  System.out.println(result1); 
  System.out.println(result2);
  System.out.println(result3);
  sequence(num);
 }
 public static String evenChecker(int num)
 {
  if (num%2==0)
  {
   String s = "Even!!";
   return s;
  }
  else 
  {
   String s = "Odd!!";
   return s;
  }
 }
 public static boolean isEven(int num)
 {
  if (num%2==0)
  {
   return true;
  }
  else 
  {
   return false;
  }
 }
 public static boolean isPos(int num)
 {
  if (num>0)
  {
   return true;
  }
  else 
  {
   return false;
  }
 }
 public static void sequence (int num)
 {
  if (num>0)
  {
   for (int i = 0; i<=num; i+=2)
   {
    System.out.print(i + " ");
   }
  }
  else if (num<0)
  {
   for (int i = num; i<=0; i-=2)
   {
    System.out.print(i + " ");
   }
  }
  else 
  {
   System.out.print(num);
  }
 }
}