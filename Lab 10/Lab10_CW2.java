/* Write a recursive function called reverseDigits that takes an integer n as an argument and prints
the digits of n in reverse order.
Hint: Think about how you solved it using loop

Sample Input  
12345 

Sample Function Call
reverseDigits(n) 

Output
5
4
3
2
1
*/

import java.util.Scanner;

public class Lab10_CW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseDigits(n);
    }

    public static void reverseDigits(int n) {
        while (true) {
            int temp = n % 10;
            System.out.println(temp);
            n = n / 10;
            if (n == 0) {
                break;
            }
        }
    }
}