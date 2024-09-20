/* You are given two arrays of the same length. The first array contains the marks of
the students and the second array contains the name of the students. You need to
sort the marks array in ascending order while maintaining the corresponding
names of the students in the names array aligned with their respective marks. Use
the Bubble sort technique to solve this problem. [Your code should work for any
given arrays] 

Given Array 1 
int [] marks = {85, 90, 75, 44, 99};
String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};

Sample Output 1
Sorted Array:
44 75 85 90 99
Marry Max Bob Alice Rosy 
*/

import java.util.Scanner;
public class Lab8_HW6
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.print("Number of students = ");
  int N = sc.nextInt();
  int[]marks = new int [N];
  String[]names = new String [N];
  for (int i = 0,j = 0; i<N && j<N; i++,j++)
  {
   System.out.println("Enter name:");
   names[i]=sc.next();
   sc.nextLine();
   System.out.println("Enter marks:");
   marks[j]=sc.nextInt();
  }
  for (int i = 0; i<marks.length-1; i++)
  {
   for (int j = 0; j<marks.length-i-1; j++)
   {
    if (marks[j]>marks[j+1])
    {
     int temp = 0;
     String temp_name = "";
     temp = marks[j];
     temp_name = names[j];
     marks[j]=marks[j+1];
     names[j]=names[j+1];
     marks[j+1]=temp;
     names[j+1]=temp_name;
    }
   }
  }
  System.out.println("Sorted Array:");
  for (int i = 0; i<marks.length; i++)
  {
   System.out.print(marks[i]+" ");  
  }
  System.out.println();
  for (int i = 0; i<marks.length; i++)
  {
   System.out.print(names[i]+" "); 
  }
 }
}