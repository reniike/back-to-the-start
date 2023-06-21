package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter citizen's name:: ");
            String citizensName = input.nextLine();
            System.out.println("Enter citizen's earning:: ");
            double earning = input.nextDouble();
            input.nextLine();

            double taxRate = 0;
            if (earning > 0 && earning <= 30_000) taxRate = earning * 0.15;
            if (earning > 30_000) taxRate = earning * 0.2;

            System.out.printf("The tax rate for %s is %.2f%n", citizensName, taxRate);
        }

    }

//    (Tax Calculator) Develop a Java application that determines the total tax for each of three
//    citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
//    earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
//    a given year. Your program should input this information for each citizen,
//    then determine and display the citizen’s total tax. Use class Scanner to input the data.
}
