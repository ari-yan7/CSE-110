/*write a Java program that displays the sum of n odd natural numbers.*/

import java.util.Scanner;
public class Lab4_HW1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int x = sc.nextInt();
        int odd = 0;
        int total = 0;
        System.out.println("The odd numbers are:");
        for (int a = 1; a <= x; a=a+1 ) 
        {
            odd = 2*a-1;
            System.out.println(odd);
            total = total+ odd;
        }
        System.out.println("The Sum of odd Natural Numbers up to "+x+"terms is: "+total);
    }
}