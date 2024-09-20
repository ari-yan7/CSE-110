/*Write a Java Program, that takes in a BRACU student ID as integer, and prints out the
year and the session the student enrolled in.
Hints:
? The first two digits denote the year the student got enrolled
? The 3rd digit denotes the session Student joined(Spring?1,Summer?3,Fall?2) 

 Sample Input
 19301307
 
 Output
 Student Joined BRAC in Summer 19

*/

import java.util.Scanner;
public class Lab3_HW4
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter your BRACU Student ID");
  int a=sc.nextInt();
  
  int year=a/1000000;
  
  int yearAndsession=a/100000;
  
  int session=yearAndsession%year;
  
  if (session==1)
  {
   System.out.println("Student Joined BRAC in Spring"+year); 
  }
  else if (session==2)
  {
   System.out.println("Student Joined BRAC in Fall"+year);
  }
  else if (session==3)
  {
   System.out.println("Student Joined BRAC in Summer"+year);
  }
 }
}