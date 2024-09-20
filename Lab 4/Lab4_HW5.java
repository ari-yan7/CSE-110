/*Write a program in Java that asks the user for an integer input, and print the individual digits
forward (From left to right).
Sample Input
32768
Sample Output
3, 2, 7, 6, 8
*/

import java.util.Scanner;

public class Lab4_HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int digit = 0;
        int count = 0;
        int temp = num;
        for (int i = 0; num > 0; i++) {
            num = num / 10;
            count++;
        }
        int pow = count - 1;
        while (temp > 0) {
            digit = (int) (temp / Math.pow(10, pow));
            temp = temp % (int) Math.pow(10, pow);
            pow--;
            if (temp == 0) {
                System.out.print(digit);
            } else {
                System.out.print(digit + ", ");
            }
            digit = 0;
        }
        System.out.println();
    }
}