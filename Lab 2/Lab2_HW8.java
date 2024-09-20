/* Assume a Hexagon where each of the sides are of the same
 length. From the visualization, we can see the values of a and b
 are given. Your task is to write a
 Java code to find the area and the circumference of the Hexagon
*/

public class Lab2_HW8
{
    public static void main (String[]args)
    {
        int a = 8;
        int b = 3;
        int c = a/2;
        double s = Math.sqrt((c*c)+(b*b));
        double area = (3*Math.sqrt(3)*s*s)/2;
        double circumference = 6*s;
        System.out.println(area);
        System.out.println(circumference);
    }
}