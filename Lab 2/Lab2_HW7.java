/*  You have been traveling on a bike for 5 hours, 56 minutes, and 23 seconds. Assuming the
 distance covered is (Last 4 digits of your student ID) meter. Write a Java code to display the
 velocity of your bike in kilometers per hour and miles per hour. [Hint: 1 mile = 1609 meters]
 Test Data:
 Input distance in meters: 2500 // Assuming the last 4 digits are 2500
 Expected Output:
 Your velocity in km/h is 0.4208951
 Your velocity in miles/h is 0.2615880
*/

public class Lab2_HW7
{
    public static void main (String[]args)
    {
        int d_m = 2500;
        double d_km = d_m/1000;
        double d_mile = d_m/1609;
        double t = 5+(56/60)+((23/60)/60);
        System.out.println("Your velocity in km/h is "+(d_km/t));
        System.out.println("Your velocity in miles/h is "+(d_mile/t));
    }
}