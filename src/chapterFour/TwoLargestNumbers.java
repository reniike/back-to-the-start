package chapterFour;

import java.util.Arrays;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTwoLargestNumbers(new int[]{123, 45, 21})));
    }
    private static int[] findTwoLargestNumbers(int[] numbers){
        int[] largest = new int[2];
        largest[0] = Integer.MIN_VALUE;
        largest[1] = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest[i]) {
                largest[1] = largest[0];
                largest[0] = numbers[i];
            }
        }
        return largest;
    }
}
//(Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
//        the two largest values of the 10 values entered. [Note: You may input each number only once
