/* Read an integer N that is the number of test cases. Each test case contains two
integer numbers X and Y. Print one output line for each test case that is the sum of all odd
values between X and Y, not including X and Y.
Sample Input/Output 
5
4
5
13
10
6
4
3
3
3
8
Sample Output
0
11
5
0
12
Explanation: Here, 5 is N which means there are five test cases. For
each test case you have to take two inputs and print the sum of all odd
numbers between X and Y (excluding X,Y). You should notice that X
could be greater than Y and vice versa.
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_loop_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 1; k <= n; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            if (y < x) {
                int temp = x;
                x = y;
                y = temp;
            }
            for (int i = x + 1, j = y; i < j; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println("Sum: " + sum);
        }
    }
}