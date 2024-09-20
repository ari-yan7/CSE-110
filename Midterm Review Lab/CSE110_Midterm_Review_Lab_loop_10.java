/* Write a java program that asks the user how many inputs they want to provide
and then takes that many inputs and prints the maximum, minimum, and average of all the
even positive numbers given by the user. If no even positive number is given, the average
should be zero.

Sample Input 
5
12
-8
19
8
-1

Sample Output
Max: 12
Min: 8
Average: 10

Explanation:
At first the user gave 5 as the input which indicates that the user
will provide 5 numbers. Then 5 numbers were taken as inputs.
Among these, only 12 and 8 are even positive numbers.
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_loop_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        int min = 0;
        int count = 0;
        double avg = 0.0;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (num > 0 && num % 2 == 0) {
                count++;
                if (count == 1) {
                    max = num;
                    min = num;
                    sum += num;
                } else {
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                    sum += num;
                }
            }
        }
        avg = sum / count;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
    }
}