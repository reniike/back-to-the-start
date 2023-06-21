package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        final int PAY_RATE = 200;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of sales made by the sales person for this week:: ");
        int amountOfSales = input.nextInt();

        int total = 0;
        for (int i = 0; i< amountOfSales ; i++) {
            System.out.printf("Enter the price of item %d ::", i + 1);
            double price = input.nextInt();
            total += price;
        }

        double commission = total / 0.9;
        double earnings = commission + PAY_RATE;

        System.out.printf("Total earnings of the salesperson is:: %f" , earnings);
    }
//    Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//    The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//    salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
//    a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//    these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
//    sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
}
