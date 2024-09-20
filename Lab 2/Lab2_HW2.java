/*  Write a Java program that given a number in inches (you have to declare and initialize it
 yourself) converts it to meters. Note: One inch is 0.0254 meters.
 Test Data:
 Given a value for inch: 1000
 Expected Output:
 1000 inch is 25.4 meters 
 */

public class Lab2_HW2
{
    public static void main (String[]args)
    {
        int a = 1000;
        double b = a*0.0254;
        System.out.printf("%d inch is %.1f meters",a,b);
    }
}