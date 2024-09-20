/* Design a Java program to calculate Sin and Cos values
 from a right-angle triangle. Assume the values of a and b are
 4.5 and 9.5 respectively. Finally, print the Sin and Cos values
 of angle A and angle B (SinA, CosA, SinB, CosB). The
 formulas to calculate these values are given below.
 Hint: You need the values for all 3 sides to calculate both
 sin and cos. You are given only a and b. How would you get
 the value of c? You’ll need the help of Math.sqrt().
 */

public class Lab2_CW5
{
    public static void main (String[]args)
    {
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt((a*a)+(b*b));
        double SinA = a/c;
        double CosA = b/c;
        double SinB = b/c;
        double CosB = a/c;
        System.out.println (SinA);
        System.out.println (CosA);
        System.out.println (SinB);
        System.out.println (CosB);
    }
}