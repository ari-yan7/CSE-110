/* Read 3 floating-point numbers (double) A, B and C and Find the two values of X.
If it's impossible to calculate the roots because a division by zero or a square root of a
negative number, presents the message “Impossible to calculate”
𝑋 = (−𝐵±𝐵^2− 4.𝐴.𝐶)/2. 𝐴

Sample Input
10.0
20.1
5.1

Sample Output
Root#1 = -0.29788
Root#2 = -1.71212

Sample Input 
0.0
20.0
5.0

Sample Output
Impossible to calculate

Explanation: The three inputs are values of A,B,C respectively. The
results are calculated accordingly.
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_BRANCHING_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double denominator = 2 * A;
        double insideroot = (B * B) - 4 * A * C;
        if (denominator == 0 || insideroot < 0) {
            System.out.println("Impossible to calculate");
        } else if (denominator != 0 && insideroot >= 0) {
            double positivenumerator = -B + Math.sqrt(insideroot);
            double root1 = positivenumerator / denominator;
            System.out.println("Root#1 = " + root1);
            double negativenumerator = -B - Math.sqrt(insideroot);
            double root2 = negativenumerator / denominator;
            System.out.println("Root#2 = " + root2);
        }
    }
}