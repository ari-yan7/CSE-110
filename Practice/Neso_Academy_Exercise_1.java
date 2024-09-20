/*Write a program which reads a sequence of integers from the user and 
 stops by displaying "Done" when the sum of these values exceeds 100*/

import java.util.Scanner;
public class Neso_Academy_Exercise_1
{
 public static void main(String[]args)
 {
  Scanner sc =new Scanner(System.in);
  int sum=0;
  while(true)
  {
   System.out.println("Enter a number:");
   sum+=sc.nextInt();
   if (sum>100)
   {
    System.out.println("Done");
    break;
   }
   else
   {
    System.out.println("Sum= "+sum); 
   }
  }
 }
}