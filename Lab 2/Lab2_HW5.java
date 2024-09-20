/* write a java program that finds the sum of the first 100 positive numbers.
 [Do NOT use loops, use the mathematical formula for calculating sum of arithmetic series given
 below].
 Note:
 S =n⁄2 (a + L), where n is the number of terms, a is the first term and L is the last term. 
 */

public class Lab2_HW5
{
    public static void main (String[]args)
    {
        int a = 1;
        int n = 100;
        int L = 100;
        int S = (n/2)*(a+L);
        System.out.println(S);
    }
}