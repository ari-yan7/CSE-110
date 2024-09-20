/*write a calculator program in Java that takes two integers and
an operator (+, -, *, /) as input and performs the corresponding calculation.

Sample Input
-99
-99
 +
 
 Output
 -198

*/

import java.util.Scanner;
public class Lab3_HW1
{
 public static void main (String[]args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter 1st integer");
  int a= sc.nextInt();
  System.out.println("Enter 2nd integer");
  int b= sc.nextInt();
  System.out.println("Enter an operator");
  String c= sc.next();
  
  int result = 0;
  
  if (c.equals("+"))
  {
    result=a+b;
  }
  else if (c.equals("-"))
  {
   result=a-b; 
  }
  else if (c.equals("*"))
  {
   result=a*b; 
  }
  else if (c.equals("/"))
  {
    if (b==0)
    {
     System.out.println("Syntax Error"); 
    }
    else 
    {
     result=a/b;
    }
  }
  System.out.println(result);
 }
}