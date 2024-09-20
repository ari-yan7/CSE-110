/* Write Java code that calculates and prints the circumference and area of a circle with a radius
 of 4 units.
 */

public class Lab2_HW3
{
    public static void main (String[]args)
    {
        int r = 4;
        double circumference = 2*Math.PI*r;
        double area = Math.PI*r*r;
        System.out.println(circumference);
        System.out.println(area);
    }
}