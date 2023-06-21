package chapterFour;

import java.math.BigDecimal;
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number:: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter balance at the end of the month:: ");
        int beginningBalance = input.nextInt();
        System.out.println("Enter total of all items charged by the customer for this month:: ");
        int totalOfItemsCharged = input.nextInt();
        System.out.println("Enter total of all credits applied to the customer's account for this month:: ");
        int totalOfCredits = input.nextInt();
        System.out.println("Enter allowed credit limit:: ");
        int creditLimit = input.nextInt();

        double newBalance = beginningBalance + totalOfItemsCharged - totalOfCredits;
        System.out.println(newBalance);

        if (newBalance > creditLimit) System.out.println("Credit limit exceeded");
    }
}
//(Credit Limit Calculator) Develop a Java application that determines whether any of several
// department-store customers has exceeded the credit limit on a charge account.
// For each customer, the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//         The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits),
//         display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".