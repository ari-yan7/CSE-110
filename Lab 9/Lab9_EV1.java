/* A. Write a method called isTriangle that takes 3 integer numbers as arguments.
 The method will return the boolean True if the 3 sides can form a valid
 triangle otherwise it’ll return the boolean False.

 Note: In a valid triangle, the sum of any two sides will be greater than the
 third side.

 Sample Method Call
 boolean res = isTriangle(7,5,10);
 System.out.println( res );

 Sample Output
 true

 Explanation
 Here, 7+5>10, 5+10>7 also,
 10+7>5. Thus, these 3 sides
 can form a valid triangle.

 Sample Method Call
 boolean res = isTtriangle(3,2,1);
 System.out.println( res );

 Sample Output
 false

 Explanation
 Here, 1+2<=3, thus, these 3
 sides can NOT form a valid
 triangle.

  B. Write a method called triArea that takes 3 sides of a triangle as 3 integer
 arguments. The method should calculate and print the area of the triangle
 only if it's a valid triangle otherwise print that it's not a valid triangle.
 Area of triangle = √[s(s−a)(s−b)(s−c)], where 's' is the semi perimeter of the
 triangle. So, semi-perimeter = s = perimeter/2 = (a + b + c)/2.

 Note: You must call the method written in task Evaluation-A, otherwise
 this task would be considered invalid.

 Sample Method Call
 triArea(3,2,1);

 Sample Output
 Can’t form triangle

 Explanation
 Here, 1+2<=3, thus, these 3
 sides can NOT form a valid
 triangle.

 Sample Method Call
 triArea(7,5,10);

 Sample Output
 16.248

 Explanation
 Here, 7,5,10 is able to form a
 valid triangle so, using the
 formula we get the area as
 16.248
*/

import java.util.Scanner;
public class Lab9_EV1
{
    public static boolean isTriangle (int a, int b, int c)
    {
        if (a+b>c && b+c>a && a+c>b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void triArea(int a, int b, int c)
    {
        if (a+b>c && b+c>a && a+c>b)
        {
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println ("Area: "+area);
        }
        else
        {
            System.out.println("Can’t form triangle");
        }
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 3 sides of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean res = isTriangle(a,b,c);
        System.out.println( res );
        triArea(a,b,c);
    }
}