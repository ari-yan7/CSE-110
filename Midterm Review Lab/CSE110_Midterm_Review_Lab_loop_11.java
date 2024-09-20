/* Write a java program that keeps on taking user inputs until the user provides 0
and prints the maximum, minimum, and average of all the even positive numbers given by
the user. If no even positive number is given, the average should be zero.

Sample Input 
12
-8
19
8
-1
0

Sample Output
Max: 12
Min: 8
Average: 10

Explanation:
After giving 5 numbers, the user provided 0, therefore, no more
inputs were taken. Among these, only 12 and 8 are even positive
numbers.
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_loop_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = 0;
        int count = 0;
        double avg = 0.0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
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
        }
        avg = sum / count;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
    }
}