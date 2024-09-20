/* Using the following table, write a program that reads a code and the amount of
 an item. After, print the value to pay. This is a very simple program with the only intention of
 practicing selection commands.

 CODE      Item         Price
 1         Hot Dog      $4.00
 2         X-Salad      $4.50
 3         X-Bacon      $5.00
 4         Toast        $2.00
 5         Soda         $1.50

 
  Sample Input
 3
 2

 Sample Output
 Item: X-Bacon
 Quantity: 2
 Total: $10.00

  Explanation: First input is the product code and second input is the
 quantity of the item. Two X-Bacon were ordered, so the value is $10.00.
*/

import java.util.Scanner;
public class CSE110_Midterm_Review_Lab_BRANCHING_2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Item: ");
        int item = sc.nextInt();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        if (item==1)
        {
            double price = 4.00;
            double total = quantity*price;
            System.out.println("Item: "+"Hot Dog");
            System.out.println("Quantity: "+quantity);
            System.out.println("Total: $"+total);
        }
        if (item==2)
        {
            double price = 4.50;
            double total = quantity*price;
            System.out.println("Item: "+"X-Salad");
            System.out.println("Quantity: "+quantity);
            System.out.println("Total: $"+total);
        }
        if (item==3)
        {
            double price = 5.00;
            double total = quantity*price;
            System.out.println("Item: "+"X-Bacon");
            System.out.println("Quantity: "+quantity);
            System.out.println("Total: $"+total);
        }
        if (item==4)
        {
            double price = 2.00;
            double total = quantity*price;
            System.out.println("Item: "+"Toast");
            System.out.println("Quantity: "+quantity);
            System.out.println("Total: $"+total);
        }
        if (item==5)
        {
            double price = 1.50;
            double total = quantity*price;
            System.out.println("Item: "+"Soda");
            System.out.println("Quantity: "+quantity);
            System.out.println("Total: $"+total);
        }
    }
}