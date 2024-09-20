/* Write a Java code that would print the following sequences using while loop:
 a)24,18,12,6,0,-6
 b)-10,-5,0,5,10,15,20
*/

public class Lab4_CW1
{
    public static void main (String[]args)
    {
        int a = 24;
        int b = -6;
        int c = -10;
        int d = 20;
        while (a>=b)
        {
            if (a>b)
            {
                System.out.print(a+",");
            }
            else
            {
                System.out.print(a);
            }
            a-=6;
        }
        System.out.println();
        while (c<=d)
        {
            if (c<d)
            {
                System.out.print(c+",");
            }
            else
            {
                System.out.print(c);
            }
            c+=5;
        }
    }
}