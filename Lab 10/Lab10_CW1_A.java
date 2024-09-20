/* Write a function called oneToN that prints 1 till N recursively.
Hint: N is a number taken as input from the user and you need to print the numbers
starting from 1 to N recursively.

Sample Input  
N=5 

Sample Function Call
oneToN(1,N); 

Output
1 2 3 4 5
*/

import java.util.Scanner;

public class Lab10_CW1_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int N = sc.nextInt();
        oneToN(1, N);
    }

    public static void oneToN(int num, int N) {
        String s = "";
        for (int i = 1; i <= N; i++) {
            s += i + " ";
        }
        System.out.println(s);
    }
}