/* Write a function called recursiveSum to sum till N recursively.
Hint: N is a number taken as input from the user and you need to add the numbers
starting from 1 to N recursively and print the sum.

Sample Input  
N=4 

Sample Function Call
recursiveSum(1,N); 

Output
10
*/

import java.util.Scanner;

public class Lab10_CW1_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int N = sc.nextInt();
        recursiveSum(1, N);
    }

    public static void recursiveSum(int num, int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}