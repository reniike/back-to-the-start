package chapterFive;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        String asterisks = "*";

        for (int i = 10; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(asterisks);
            }
            System.out.println();
        }
    }
}
