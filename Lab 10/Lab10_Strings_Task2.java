/* Write a method modifyStrings() that takes in three given strings S, S1, and S2 consisting of
different numbers of characters respectively, the task is to modify the string S by replacing all
the substrings S1 with the string S2 in the string S and printing the modified string S.
Sample Input  
S = "abababa"
S1 = "aba"
S2 = "a"
modifyStrings(S, S1, S2);

Sample Output
aba

Explanation
Changing the substrings S[0, 2](Referring to
characters from the 0th index of S till the 2nd
index of S and S[4, 6] (= S1) to the string S2 (=
"a") modifies the string S to "aba". Therefore, print
"aba".

Sample Input
S = "baddadda"
S1 = "dd"
S2 = "n"
modifyStrings(S, S1, S2);

Sample Output
banana

Explanation
Changing the substrings S[2,3](Referring to
characters from the 2nd and 3rd index of S) and
S[5, 6] (= S1) to the string S2 (= "n") modifies
the string S to "banana". Therefore, print "banana". 
*/

import java.util.Scanner;

public class Lab10_Strings_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("S = ");
        String S = sc.nextLine();
        System.out.println();
        System.out.print("S1 = ");
        String S1 = sc.nextLine();
        System.out.println();
        System.out.print("S2 = ");
        String S2 = sc.nextLine();
        System.out.println();
        modifyStrings(S, S1, S2);
    }

    public static void modifyStrings(String S, String S1, String S2) {
        int count = 0;
        String S3 = "";
        for (int i = 0, j = 0; i < S.length(); i++) {
            char c1 = S.charAt(i);
            char c2 = S1.charAt(j);
            if (j == 0 && c1 != c2) {
                S3 += S.charAt(i);
            }
            if (c1 == c2) {
                count++;
                j++;
                if (count == S1.length()) {
                    S3 += S2;
                    j = 0;
                    count = 0;
                }
            }
        }
        System.out.println(S3);
    }
}