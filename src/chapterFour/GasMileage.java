package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many trips did you go: ");
        int trips = input.nextInt();

        double totalOfMilesGallon = 0;
        for (int i = 0; i < trips; i++) {
            System.out.printf("Enter miles driven for trip %d: ", i + 1);
            int miles = input.nextInt();
            System.out.printf("Enter amount of gallons used for the trip %d: %n", i + 1);
            int gallons = input.nextInt();

            System.out.printf("For %d miles, you used a total number of %d gallons %n", miles , gallons );
            totalOfMilesGallon += miles / (float)gallons;
        }
        System.out.printf("The combined miles per gallon obtained for all trips is: %f ", totalOfMilesGallon);
    }
}
//         (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.

//        The program should calculate and display the miles per gallon obtained for each trip and
//        print the combined miles per gallon obtained for all trips up to this point.
//
//        All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
//        from the user.