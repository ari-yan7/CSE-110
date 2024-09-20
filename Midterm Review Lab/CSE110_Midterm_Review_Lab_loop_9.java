/* Write a java program that takes a binary number as input from the user and
prints its decimal equivalent.
Sample Input
1111
Sample Output
15
Explanation
1(2^3)+ 1(2^2)+ 1(2^1)+ 1(2^0) = 15

Sample Input
0101 
Sample Output
5 
Explanation
0(2^3)+ 1(2^2)+ 0(2^1)+ 1(2^0) = 5
*/

import java.util.Scanner;

public class CSE110_Midterm_Review_Lab_loop_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        int sum = 0;
        int temp = num;
        while (true) {
            int temp1 = temp % 10;
            digit++;
            temp = temp/10;
            if (temp == 0) {
                break;
            }
        }
        for (int power = 0; power<=digit; power++){
            int temp2 = num%10;
            num = num/10;
            sum+=temp2*Math.pow(2,power);
        }
        System.out.println(sum);
    }
}