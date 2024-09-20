/*Writing a program that displays the sum of digits of an integer read from the user.*/

import java.util.Scanner;
public class Neso_Academy_Exercise_5
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  int sum=0;
  while(n!=0)
  {
    int a=n%10;
    sum+=a;
    n=n/10;
  }
  System.out.println("Sum of digits: "+sum);
 }
}