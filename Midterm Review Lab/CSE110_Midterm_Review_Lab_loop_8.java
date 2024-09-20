/* Write a java program that takes an integer input from the user and calculates the
sum of its digits. If the summation is even, please print “The number is even.” otherwise
print “The number is odd.”

Sample Input 
54637 
Sample Output
The sum is odd.
Explanation: 5+4+6+3+7=25 which is odd.

Sample Input
2754 
Sample Output
The sum is even.
Explanation: 2+7+5+4=18 which is even
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_loop_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (true) {
            sum += (num % 10);
            num = num / 10;
            if (num == 0) {
                break;
            }
        }
        if (sum % 2 == 0) {
            System.out.println("The sum is even.");
        } else {
            System.out.println("The sum is odd.");
        }
    }
}