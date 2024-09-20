/* Given an array of email addresses, print the number of valid email addresses satisfying the
following conditions.
a) Each email contains an ‘@’ character
b) There is at least one character before and after ‘@’ character and it has to start with letter
c) There is a ‘.’ character after the character(s) after ‘@’ character
d) There is at least one character after ‘.’ character

Sample Input 
email_list = {"abc@gmail.com", "!@cv.bd", "123cse@bracu.ac.bd"} 

Sample Output
1

Sample Input
email_list = {"cse110@gmail.com", "government@cv.", "eee@bracu.ac.bd"}

Sample Output
2
*/

public class Lab10_Task3 {
    public static void main(String[] args) {
        String[] email_list = { "cse110@gmail.com", "government@cv.", "eee@bracu.ac.bd" };
        int valid = 0;
        for (int i = 0; i < email_list.length; i++) {
            String s = email_list[i];
            int atindex = -1;
            int dotindex = -1;
            boolean startwithletter = false;
            for (int j = 0; j < s.length(); j++) {
                char a = s.charAt(j);
                int ascii = (int) a;

                if (j == 0 && ascii >= 97 && ascii <= 122) {
                    startwithletter = true;
                }
                if (ascii == 64) {
                    if (atindex == -1 && j > 0 && startwithletter) {
                        atindex = j;
                    } else {
                        break;
                    }
                }
                if (j > atindex + 1 && atindex != -1 && ascii == 46) {
                    dotindex = j;
                }
            }
            if (atindex > 0 && dotindex > atindex + 1 && dotindex < s.length() - 1) {
                valid++;
            }
        }
        System.out.println(valid);
    }
}