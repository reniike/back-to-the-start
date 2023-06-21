package chapterFour;


public class FindTheLargestNumber {
    public static void main(String[] args) {
        System.out.println(findTheLargestNumber(new int[]{1, 2, 45, 23, 21, 45, 21, 56, 104, 56}));
    }
    private static int findTheLargestNumber(int[] numbers){
        int largest = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest)  largest = numbers[i];
        }
        return largest;
    }
}
//(Find the Largest Number) The process of finding the largest value is used frequently in computer applications.
//  For example, a program that determines the winner of a sales contest would input
//        the number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
//        Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines
//        and prints the largest integer. Your program should use at least the following three variables:
//        a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
//        input and to determine when all 10 numbers have been processed).
//        b) number: The integer most recently input by the user.
//        c) largest: The largest number found so far.
