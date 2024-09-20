/* Write a java program that takes an integer input from the user and finds the
Collatz sequence of that number.
➢ Collatz Number:
■ If the current number is even, divide it by 2.
■ If the current number is odd, multiply it by 3 and add 1.
■ Repeat the process until the number becomes 1.
Sample input
4
Sample output
4,2,1
Explanation
4/2 -> 2/2 -> 1 (stop)

Sample input
6
Sample output
6,3,10,5,16,8,4,2,1
Explanation
6/2 -> 3*3+1 -> 10/2 -> 5*3+1 -> 16/2 ->8/2 -> 4/2 -> 2/2 -> 1 (stop)
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_loop_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num + ", ");
        while (true) {
            if (num % 2 == 0 && num != 1) {
                num = num / 2;
                if (num == 1) {
                    System.out.print(num);
                } else {
                    System.out.print(num + ", ");
                }
            }
            if (num % 2 != 0 && num != 1) {
                num = (num * 3) + 1;
                System.out.print(num + ", ");
            }
            if (num == 1) {
                break;
            }
        }
    }
}