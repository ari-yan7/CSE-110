/* A. Write a method called calcTax that takes 2 arguments which are your age
then your salary. The method must calculate and return the tax as per the
following conditions:
? No tax if you are less than 18 years old.
? No tax if you get paid less than 10,000
? 7% tax if you get paid between 10K and 20K
? 14% tax if you get paid more than 20K

Sample Method Call
double t = calcTax(16,20000);
System.out.println(t); 

Output
0.0

Explanation
Here, the age is less than 18 so
0 tax.

Sample Method Call 
double t = calcTax(20,18000);
System.out.println(t); 

Output
1260.0

Explanation
Here, the age is greater than 18
and income is between
10K-20K so tax is 7% of
18000 = 1260.

B. Write a method called calcYearlyTax that takes no arguments. Inside the
method it should take first input as your age and then 12 other inputs as
income of each month of the year. The method must calculate and print Tax
for each month and finally print the total Tax of the whole year based on the
HW-3A conditions.
Note: You must call the method written in task HW-3A, otherwise this task
would be considered invalid.

Sample Method Call
calcYearlyTax() 

Output
22
8000
15000
22000
2300
15300
21000
34000
9000
27000
88000
32000
7300 

Explanation
Month1 tax: 0
Month2 tax: 1050.0
Month3 tax: 3080.0
Month4 tax: 0
Month5 tax: 1071.0
Month6 tax: 2940.0
Month7 tax: 4760.0
Month8 tax: 0
Month9 tax: 3780.0
Month10 tax: 12320.0
Month11 tax: 4480.0
Month12 tax: 0
Total Yearly Tax: 33481.0
*/

import java.util.Scanner;
public class Lab9_HW3
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.print("Enter your age: ");
  int age = sc.nextInt();
  System.out.print("Enter your current salary: ");
  int salary = sc.nextInt();
  double t = calcTax(age,salary);
  System.out.println(t); 
  calcYearlyTax(age, salary);
 }
 public static double calcTax(int age, int salary)
 {
  double tax = 0;
  if (age<18)
  {
   return 0.0;
  }
  else if (age>18 && salary<10000)
  {
   return 0.0; 
  }
  else if (age>18 && salary>=10000 && salary<=20000)
  {
   tax = salary*0.07; 
  }
  else if (age>18 && salary>20000)
  {
   tax = salary*0.14;
  }
  double t=tax;
  return t;
 }
 public static void calcYearlyTax(int age, int salary)
 {
  if (age>18)
  {
   double yearlyTax = 0;
   for (int i = 1; i<=12; i++)
   {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter Month "+i+" Salary:");
    int monthlySalary = sc.nextInt();
    if (monthlySalary<10000)
    {
     System.out.println("Month"+i+" tax: 0");
    }
    else if (monthlySalary>=10000 && monthlySalary<=20000)
    {
     double monthlytax = monthlySalary*0.07;
     System.out.println("Month"+i+" tax:"+monthlytax);
     yearlyTax+= monthlytax;
    }
    else if (monthlySalary>20000)
    {
     double monthlytax = monthlySalary*0.14;
     System.out.println("Month "+i+" tax:"+monthlytax);
     yearlyTax+=monthlytax;
    }
   }
   System.out.println("Total Yearly tax: "+yearlyTax);
  }
 }
}