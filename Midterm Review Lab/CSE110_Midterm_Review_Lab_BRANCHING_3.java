/* Read the four integer values corresponding to the x and y axes of two points, p1(x1,y1)
and p2(x2,y2) and calculate the distance between them. Also,show whether the
 slope created from this line is positive or negative or zero.The formulas are given below:

  Distance= square root ((𝑥2−𝑥1)^2+(𝑦2−𝑦1)^2)
  Slope= (𝑦2−𝑦1)/ (𝑥2−𝑥1)

  Sample Input
 1.0
 7.0
 5.0
 9.0

 Sample Output
 Distance: 7.211102550927978
 Slope: 0.6666666666666666
 The slope is positive
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_BRANCHING_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 = ");
        double x1 = sc.nextDouble();
        System.out.print("x2 = ");
        double x2 = sc.nextDouble();
        System.out.print("y1 = ");
        double y1 = sc.nextDouble();
        System.out.print("y2 = ");
        double y2 = sc.nextDouble();
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double slope = (double) (y2 - y1) / (x2 - x1);
        System.out.println("Distance: " + distance);
        System.out.println("Slope: " + slope);
        if (slope > 0) {
            System.out.println("The slope is positive");
        } else {
            System.out.println("The slope is negative");
        }
    }
}