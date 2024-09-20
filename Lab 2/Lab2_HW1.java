/* Write a Java code where given an integer we need to print the last 2 digits of that number.*/

public class Lab2_HW1
{
    public static void main (String[]args)
    {
        int a = 1234567;
        int b = a % 10;
        int c = (a % 100)/10;
        System.out.println(b);
        System.out.println(c);
    }
}