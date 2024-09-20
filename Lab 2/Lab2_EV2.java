/* Write a Java program that displays the 2 rightmost digits of your student ID in reverse order.
 For example, if your student id is 23221454, you need to print 4, and then 5.
 [Hint: Use the logic you used in one of the tasks in lab 1]
 Output:
 4
 5

 */

public class Lab2_EV2
{
    public static void main (String[]args)
    {
        int a = 23221454;
        int b = a % 10;
        int c = (a % 100)/10;
        System.out.println(b);
        System.out.println(c);
    }
}