/* Write a recursive function called sumDigits that takes an integer n as an argument and sums up
the digits of n then returns the result.
Hint: Think about how you would solve it using loop

Sample Input  
12345 

Sample Function Call
int x = sumDigits(n);
System.out.println(x);

Output
15
*/

import java.util.Scanner;

public class Lab10_CW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sumDigits(n);
        System.out.println(x);
    }

    public static int sumDigits(int n) {
        int x = 0;
        while (true) {
            int temp = n % 10;
            x += temp;
            n = n / 10;
            if (n == 0) {
                break;
            }
        }
        return x;
    }
}