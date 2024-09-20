/*Calculate a car's average consumption being provided the total distance traveled
(in Km) and the spent fuel total (in liters).

 Sample Input
 500
 35.0
 
 Sample Output
 14.286 km/l
 
 Explanation: First input 500 represents the total distance (in Km) and the
 second one is a floating point number representing the spent fuel (in Litre).

*/

import java.util.Scanner;
public class CSE110_Midterm_Review_Lab_BRANCHING_1
{
 public static void main (String[]args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter distance");
   int a=sc.nextInt();
   System.out.println("Enter fuel");
   float b=sc.nextFloat();
   float c=a/b;
   System.out.printf("%.3f km/l%n",c);
 }
}