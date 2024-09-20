/* Read an integer N that is the number of test cases that follow. Each test case
contains two integers X and Y. Print one output line for each test case that is the sum of Y
odd numbers from X including it if is the case. For example:
for the input 4 5, the output must be 45, that is: 5 + 7 + 9 + 11 + 13
for the input 7 4, the output must be 40, that is: 7 + 9 + 11 + 13
Sample Input 
2
4
3
11
2
Sample Output
21
24
Explanation: Here, 2 in N which means there are two test cases. For
each test case you have to take two inputs and print the sum of all odd
numbers between X and Y (excluding X,Y).
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_loop_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            for (int j = y, k = x; j > 0; k++) {
                if (k % 2 != 0) {
                    sum += k;
                    j--;
                }
            }
            System.out.println("Sum: " + sum);
        }
    }
}