package chapterFour;

import java.util.Scanner;

//Question 4.15
public class CorrectTheErrors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an age: ");
        int age = input.nextInt();

//a
        if (age >= 65) {
            System.out.println("Age is greater than or equal to 65");
        } else
            System.out.println("Age is less than 65");

//b
        int x = 1;
        int total = 0;
        while (x <= 10) {
            total = ++x;
        }
        System.out.println(total);

//c

        int x1 = 0;
        while (x1 <= 100) {
            total += x1;
            x1++;
        }

//d
        int y = 0;
        while (y != 0) {
            System.out.println(y);
        }
    }
}
