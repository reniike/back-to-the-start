package chapterFive;

public class SumOfMinAndMax {
    public static void main(String[] args) {
        System.out.println(findSumOfMinAndMax(new int[]{1,2,34,5,67,8}));
    }

    private static int findSumOfMinAndMax(int[] numbers){
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int sum;

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] < minimum) minimum = numbers[i];
        }
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] > maximum) maximum = numbers[i];
        }
        sum = minimum + maximum;
        return sum;
    }
}

//(Extremes) Write an application that finds the minimum and maximum amongst several
//integers and then computes the sum of the two extremes. The user will be prompted to input how
//many values the application should ask the user to input