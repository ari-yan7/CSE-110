/* Write a Java code that asks an integer as input from the user and takes that many integer
 inputs.Your task is to count how many numbers are non-negative and negative.
 Sample Input:(The purple numbers are input.)
 Enter an integer:9
 Enter number 1:-8
 Enter number 2:33
 Enter number 3:-100
 Enter number 4:10
 Enter number 5:0
 Enter number 6:5
 Enter number 7:10
 Enter number 8:-4
 Enter number 9:4
 Sample Output:
 6 Non-negative Numbers
 3 Negative Numbers
*/

import java.util.Scanner;
public class Lab4_EV2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int non_neg = 0;
        int neg = 0;
        for (int i = 1; i<=n; i++)
        {
            System.out.printf("Enter number %d: ",i);
            int a = sc.nextInt();
            if (a>=0)
            {
                non_neg++;
            }
            else if (a<0)
            {
                neg++;
            }
        }
        System.out.printf("%d Non-negative numbers",non_neg);
        System.out.println();
        System.out.printf("%d negative numbers",neg);
    }
}