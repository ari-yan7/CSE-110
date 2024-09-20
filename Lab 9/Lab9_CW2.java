/*  A. Write a method called circleArea that takes an integer radius in its
 parameter and returns the area of the circle.

 Sample Method Call
 double area = circleArea(5);
 System.out.println(area);

 Sample Output
 78.5398

 B. Write a method called sphereVolume that takes an integer radius in its
 parameter and returns the volume of the sphere.

  Note: volume of a sphere is 4/3*π𝑟^3

 Sample Method Call
 double volume = sphereVolume(5);
 System.out.println(volume);

 Sample Output
 523.5987

  C. Write a method called findSpace that takes two values in its parameters one
 is an integer diameter and another one is a String. Using the given diameter,
 this method should calculate the Area of a circle or the Volume of a sphere
 depending on the value of the second parameter. Finally, it should print the
 result inside the method.
 Note: You must call the method written in task CW-2A & CW-2B,
 otherwise this task would be considered invalid.

 Sample Method Call
 findSpace(10,"circle");
 Sample Output
 78.5398

 Sample Method Call
 findSpace(10,"sphere");
 Sample Output
 523.5987

 Sample Method Call
 findSpace(10,"square");
 Sample Output
 “Wrong Parameter”
*/

import java.util.Scanner;
public class Lab9_CW2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double area = circleArea(radius);
        System.out.println("Area of circle: "+area);
        double volume = sphereVolume(radius);
        System.out.println("Volume of sphere: "+volume);
        System.out.print("Enter shape: ");
        sc.nextLine();
        String shape = sc.nextLine();
        System.out.print("Enter Diameter: ");
        int diameter = sc.nextInt();
        findSpace(diameter, shape);
    }
    public static double circleArea (int radius)
    {
        return Math.PI * Math.pow(radius,2);
    }
    public static double sphereVolume(int radius)
    {
        return (4.0/3)*Math.PI*Math.pow(radius,3);
    }
    public static void findSpace (int diameter, String shape)
    {
        int radius = diameter/2;
        if (shape.equals("circle"))
        {
            double area = circleArea(radius);
            System.out.println("Area of circle: "+area);
        }
        else if (shape.equals("sphere"))
        {
            double volume = sphereVolume(radius);
            System.out.println("Volume of sphere: "+volume);
        }
        else
        {
            System.out.println("Wrong Parameter");
        }
    }
}