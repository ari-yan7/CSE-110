/* Write a Java program to convert minutes into years and days. For simplicity, assume each
 year consists of 365 days.
 Test Data:
 Given the number of minutes: 3456789
 Expected Output:
 3456789 minutes is approximately 6 years and 210 days */

 public class Lab2_CW4
 {
    public static void main (String[]args)
    {
        int min = 3456789;
        int years = ((min/60)/24)/365;
        int min_left = (min - (years*365*24*60));
        int days = (min_left/60)/24;
        System.out.printf("%d minutes is approximately %d years and %d days", min,years,days);
    }
 }