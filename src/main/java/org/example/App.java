package org.maven;
import java.util.*;
public class App
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Children");
        int no_of_children = sc.nextInt();
        System.out.println("Enter Weight of Chocolate");
        int chocolate_weight=sc.nextInt();
        System.out.println("Enter Weight of Candy");
        int candy_weight = sc.nextInt();

        String name[]=new String[no_of_children];
        int chocolates[]=new int[no_of_children];
        int candies[]=new int[no_of_children];

        System.out.println("Data Filing Starts");

        for(int i=0;i<no_of_children;i++)
        {
            System.out.println("Enter Name of Student");
            name[i] = sc.next();
            System.out.println("Enter Number of Chocolates this Student received");
            chocolates[i] = sc.nextInt();
            System.out.println("Enter Number of Candies this Student received");
            candies[i] = sc.nextInt();
        }

        Candy candy = new Candy(candy_weight, no_of_children, candies, name);

        Chocolate chocolate = new Chocolate(chocolate_weight, no_of_children, chocolates, name);

        NewYearGift newYearGift = new NewYearGift(chocolate_weight, candy_weight, no_of_children, chocolates, candies, name);

        candy.display();

        chocolate.display();

        newYearGift.display();
    }
}