/* Write a function nToOne that prints from N to 1 recursively.
Hint: N is a number taken as input from the user and you need to print the numbers
starting from N to 1.

Sample Input  
N=6 

Sample Function Call
nToOne(1,N);

Output
6 5 4 3 2 
*/

import java.util.Scanner;

public class Lab10_CW1_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int N = sc.nextInt();
        nToOne(1, N);
    }

    public static void nToOne(int num, int N) {
        String s = "";
        for (int i = N; i >= 1; i--) {
            s += i + " ";
        }
        System.out.println(s);
    }
}