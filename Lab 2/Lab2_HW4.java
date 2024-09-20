/* Write a Java Code to display the multiplication table for a given positive integer 'n'. The table
 should include the products of 'n' with each of the numbers from 1 to 10. For example, if n = 5,
 your code should output:
 5 x 1=5
 5 x 2=10
 5 x 3=15
 ...
 5 x 10 =50
 [You are not allowed to use loops to solve this problem.]
 */

public class Lab2_HW4
{
    public static void main (String[]args)
    {
        int n = 5;
        int a = n*1;
        int b = n*2;
        int c = n*3;
        int d = n*4;
        int e = n*5;
        int f = n*6;
        int g = n*7;
        int h = n*8;
        int i = n*9;
        int j = n*10;
        System.out.println(n+" x 1 = "+a);
        System.out.println(n+" x 2 = "+b);
        System.out.println(n+" x 3 = "+c);
        System.out.println(n+" x 4 = "+d);
        System.out.println(n+" x 5 = "+e);
        System.out.println(n+" x 6 = "+f);
        System.out.println(n+" x 7 = "+g);
        System.out.println(n+" x 8 = "+h);
        System.out.println(n+" x 9 = "+i);
        System.out.println(n+" x 10 = "+j);
    }
}